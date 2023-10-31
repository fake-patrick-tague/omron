package com.alivecor.mapsforge.record;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.package_11.Fragment;
import com.alivecor.alivecorkitlite.R.id;
import com.alivecor.alivecorkitlite.R.string;
import com.alivecor.asm.Plot;

public class PostRecordingErrorFragment
  extends RecordingError2ButtonFragment
{
  private static final String ARG_EVALUATION_RESULTS = "evaluation results";
  private static final String ARG_HELP_URL = "help url";
  private static final String ARG_MESSAGE = "message";
  private static final String ARG_TITLE = "title";
  private Plot recordingResult;
  
  public PostRecordingErrorFragment() {}
  
  public static PostRecordingErrorFragment create(Plot paramPlot, int paramInt1, int paramInt2, String paramString)
  {
    PostRecordingErrorFragment localPostRecordingErrorFragment = new PostRecordingErrorFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("evaluation results", paramPlot);
    localBundle.putInt("title", paramInt1);
    localBundle.putInt("message", paramInt2);
    localBundle.putString("help url", paramString);
    localPostRecordingErrorFragment.setArguments(localBundle);
    return localPostRecordingErrorFragment;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if ((getArguments() != null) && (getArguments().containsKey("evaluation results")))
    {
      recordingResult = ((Plot)getArguments().getSerializable("evaluation results"));
      return;
    }
    throw new IllegalArgumentException("This class must be instantiated with #create()");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramLayoutInflater.findViewById(R.id.recording_error_2_btn_help).setOnClickListener(new PostRecordingErrorFragment.1(this));
    if ((getArguments() != null) && (getArguments().containsKey("evaluation results")))
    {
      title.setText(getArguments().getInt("title"));
      message.setText(getArguments().getInt("message"));
      positiveButton.setText(R.string.save_this_ekg);
      positiveButton.setOnClickListener(new h(this));
      negativeButton.setText(R.string.record_new_ekg);
      negativeButton.setOnClickListener(new WalletDisclaimerFragment.1(this));
      return paramLayoutInflater;
    }
    throw new IllegalArgumentException("This class must be instantiated with #create()");
  }
}
