package com.alivecor.mapsforge.record;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.package_11.DialogFragment;
import androidx.fragment.package_11.Fragment;
import com.alivecor.alivecorkitlite.R.id;
import com.alivecor.alivecorkitlite.R.layout;
import com.alivecor.alivecorkitlite.R.string;
import com.alivecor.alivecorkitlite.R.style;

public class DeterminationsInfoFragment
  extends DialogFragment
{
  TextView bradycardiaTextView;
  TextView noAnalysisTextView;
  TextView normalTextView;
  TextView possibleAfibTextView;
  TextView potentialFindingsTextView;
  TextView tachycardiaTextView;
  TextView tooShortTextView;
  Toolbar toolbar;
  TextView unclassifiedTextView;
  TextView unreadableTextView;
  
  public DeterminationsInfoFragment() {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setStyle(0, R.style.FullscreenDialogFragLightActionBar);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.determinations_info, paramViewGroup, false);
    toolbar = ((Toolbar)paramLayoutInflater.findViewById(R.id.determinations_info_toolbar));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_normal_textView);
    normalTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_normal)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_bradycardia_textView);
    bradycardiaTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_bradycardia)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_tachycardia_textView);
    tachycardiaTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_tachycardia)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_possible_afib_textView);
    possibleAfibTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_possible_afib)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_unclassified_textView);
    unclassifiedTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_unclassified)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_unreadable_textView);
    unreadableTextView = paramViewGroup;
    paramViewGroup.setMovementMethod(LinkMovementMethod.getInstance());
    unreadableTextView.setText(FragmentUrlSpan.replaceURLSpans(getActivity(), Html.fromHtml(getString(R.string.cpom_determination_info_unreadable))));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_too_short_textView);
    tooShortTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_too_short)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_no_analysis_textView);
    noAnalysisTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_no_analysis)));
    paramViewGroup = (TextView)paramLayoutInflater.findViewById(R.id.cpom_determination_info_potential_findings_textView);
    potentialFindingsTextView = paramViewGroup;
    paramViewGroup.setText(Html.fromHtml(getString(R.string.cpom_determination_info_potential_findings)));
    toolbar.setNavigationOnClickListener(new d(this));
    return paramLayoutInflater;
  }
}
