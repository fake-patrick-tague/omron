package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.R.dimen;
import com.braze.ui.R.id;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.util.Objects;
import kotlin.x.c.a;
import kotlin.x.d.i;
import kotlin.x.d.j;
import v7.v7.package_13.f;

public class InAppMessageSlideupView
  extends InAppMessageBaseView
{
  private InAppMessageImageView inAppMessageImageView;
  
  public InAppMessageSlideupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final View getMessageChevronView()
  {
    return findViewById(R.id.com_braze_inappmessage_slideup_chevron);
  }
  
  public final void applyInAppMessageParameters(IInAppMessage paramIInAppMessage)
  {
    i.e(paramIInAppMessage, "inAppMessage");
    InAppMessageImageView localInAppMessageImageView = (InAppMessageImageView)findViewById(R.id.com_braze_inappmessage_slideup_imageview);
    inAppMessageImageView = localInAppMessageImageView;
    if (localInAppMessageImageView != null) {
      localInAppMessageImageView.setInAppMessageImageCropType(paramIInAppMessage.getCropType());
    }
  }
  
  public void applyWindowInsets(f paramF)
  {
    i.e(paramF, "insets");
    super.applyWindowInsets(paramF);
    if ((getLayoutParams() != null) && ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      Object localObject = getLayoutParams();
      Objects.requireNonNull(localObject, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      ((ViewGroup.MarginLayoutParams)localObject).setMargins(ViewUtils.getMaxSafeLeftInset(paramF) + leftMargin, ViewUtils.getMaxSafeTopInset(paramF) + topMargin, ViewUtils.getMaxSafeRightInset(paramF) + rightMargin, ViewUtils.getMaxSafeBottomInset(paramF) + bottomMargin);
      return;
    }
    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, null, null, applyWindowInsets.1.INSTANCE, 3, null);
  }
  
  public View getMessageBackgroundObject()
  {
    return findViewById(R.id.com_braze_inappmessage_slideup_container);
  }
  
  public TextView getMessageIconView()
  {
    return (TextView)findViewById(R.id.com_braze_inappmessage_slideup_icon);
  }
  
  public ImageView getMessageImageView()
  {
    return inAppMessageImageView;
  }
  
  public TextView getMessageTextView()
  {
    return (TextView)findViewById(R.id.com_braze_inappmessage_slideup_message);
  }
  
  public void resetMessageMargins(boolean paramBoolean)
  {
    super.resetMessageMargins(paramBoolean);
    Object localObject = getMessageIconView();
    int k = 0;
    int j = k;
    if (localObject != null)
    {
      localObject = ((TextView)localObject).getText();
      j = k;
      if (localObject != null)
      {
        int i;
        if (((CharSequence)localObject).length() == 0) {
          i = 1;
        } else {
          i = 0;
        }
        j = k;
        if (i == 0) {
          j = 1;
        }
      }
    }
    if ((!paramBoolean) && ((j ^ 0x1) != 0))
    {
      localObject = (RelativeLayout)findViewById(R.id.com_braze_inappmessage_slideup_image_layout);
      if (localObject != null) {
        ViewUtils.removeViewFromParent((View)localObject);
      }
      TextView localTextView = (TextView)findViewById(R.id.com_braze_inappmessage_slideup_message);
      if (localTextView != null) {
        localObject = localTextView.getLayoutParams();
      } else {
        localObject = null;
      }
      localObject = (RelativeLayout.LayoutParams)localObject;
      if (localObject != null) {
        leftMargin = getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
      }
      localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
  }
  
  public void setMessageBackgroundColor(int paramInt)
  {
    Object localObject = getMessageBackgroundObject();
    if (localObject != null) {
      localObject = ((View)localObject).getBackground();
    } else {
      localObject = null;
    }
    if ((localObject instanceof GradientDrawable))
    {
      localObject = getMessageBackgroundObject();
      if (localObject != null) {
        InAppMessageViewUtils.setViewBackgroundColorFilter((View)localObject, paramInt);
      }
    }
    else
    {
      super.setMessageBackgroundColor(paramInt);
    }
  }
  
  public final void setMessageChevron(int paramInt, ClickAction paramClickAction)
  {
    i.e(paramClickAction, "clickAction");
    if (paramClickAction == ClickAction.NONE)
    {
      paramClickAction = getMessageChevronView();
      if (paramClickAction == null) {
        return;
      }
      paramClickAction.setVisibility(8);
      return;
    }
    paramClickAction = getMessageChevronView();
    if (paramClickAction != null) {
      InAppMessageViewUtils.setViewBackgroundColorFilter(paramClickAction, paramInt);
    }
  }
}
