package com.alivecor.mapsforge.record;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alivecor.alivecorkitlite.R.id;
import com.alivecor.alivecorkitlite.R.layout;
import com.alivecor.alivecorkitlite.R.styleable;

public class EcgBadge
  extends LinearLayout
{
  private Drawable mIconDrawable;
  private int mIconRightMargin;
  private ImageView mIconView;
  private View mSpace;
  private int mTextColor;
  private String mTitleStr;
  private TextView mTitleView;
  private String mValueStr;
  private TextView mValueView;
  
  public EcgBadge(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public EcgBadge(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public EcgBadge(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init()
  {
    View.inflate(getContext(), R.layout.ecg_badge, this);
    setOrientation(1);
    mIconView = ((ImageView)findViewById(R.id.icon));
    mSpace = findViewById(R.id.space);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    TextView localTextView = (TextView)findViewById(R.id.value);
    mValueView = localTextView;
    localTextView.setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts.adobe_source-sans-pro/SourceSansPro-Bold.ttf"));
    localTextView = (TextView)findViewById(R.id.title);
    mTitleView = localTextView;
    localTextView.setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts.adobe_source-sans-pro/SourceSansPro-Semibold.ttf"));
    init();
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.EcgBadge, 0, 0);
    try
    {
      mValueStr = paramContext.getString(R.styleable.EcgBadge_badgeValue);
      mTitleStr = paramContext.getString(R.styleable.EcgBadge_badgeTitle);
      mIconDrawable = paramContext.getDrawable(R.styleable.EcgBadge_badgeIcon);
      mIconRightMargin = ((int)paramContext.getDimension(R.styleable.EcgBadge_badgeAfterIconMargin, 0.0F));
      mTextColor = paramContext.getColor(R.styleable.EcgBadge_badgeTextColor, -16777216);
      paramContext.recycle();
      setValue(mValueStr);
      setTitle(mTitleStr);
      setIcon(mIconDrawable);
      setIconRightMargin(mIconRightMargin);
      setTextColor(mTextColor);
      return;
    }
    catch (Throwable paramAttributeSet)
    {
      paramContext.recycle();
      throw paramAttributeSet;
    }
  }
  
  private void setIcon(Drawable paramDrawable)
  {
    mIconDrawable = paramDrawable;
    mIconView.setImageDrawable(paramDrawable);
    invalidate();
  }
  
  private void setIconRightMargin(int paramInt)
  {
    mIconRightMargin = paramInt;
    mSpace.getLayoutParams().width = mIconRightMargin;
    invalidate();
  }
  
  private void setTextColor(int paramInt)
  {
    mTextColor = paramInt;
    mValueView.setTextColor(paramInt);
    mTitleView.setTextColor(mTextColor);
    invalidate();
  }
  
  private void setTitle(String paramString)
  {
    if (TextUtils.equals(mTitleView.getText(), paramString)) {
      return;
    }
    mTitleStr = paramString;
    mTitleView.setText(paramString);
    invalidate();
  }
  
  public void setValue(String paramString)
  {
    if (TextUtils.equals(mValueView.getText(), paramString)) {
      return;
    }
    mValueStr = paramString;
    mValueView.setText(paramString);
    invalidate();
  }
}
