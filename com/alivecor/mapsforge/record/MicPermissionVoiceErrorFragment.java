package com.alivecor.mapsforge.record;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.package_10.ActivityCompat;
import androidx.fragment.package_11.Fragment;
import com.alivecor.alivecorkitlite.R.drawable;
import com.alivecor.alivecorkitlite.R.string;
import java.util.Arrays;
import l.a.a;
import l.a.a.c;

public class MicPermissionVoiceErrorFragment
  extends RecordingError1ButtonFragment
{
  public MicPermissionVoiceErrorFragment() {}
  
  private void requestPermission()
  {
    a.f("EEEE").a("actionBtn setOnClickListener MicPermissionVoiceErrorFragment", new Object[0]);
    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), "android.permission.RECORD_AUDIO"))
    {
      PermissionsUtil.askForRecordAudio(this);
      return;
    }
    Util.startMyAppSettings(getActivity());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    title.setText(R.string.recording_error_mic_voice_title);
    message.setText(R.string.recording_error_mic_voice_message);
    icon.setImageResource(R.drawable.mic_icon_large);
    int i;
    if (!ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), "android.permission.RECORD_AUDIO"))
    {
      paramLayoutInflater = actionBtn;
      i = R.string.recording_error_mic_voice_cta;
    }
    else
    {
      paramLayoutInflater = actionBtn;
      i = R.string.allow_access;
    }
    paramLayoutInflater.setText(i);
    actionBtn.setOnClickListener(new RadialTimePickerDialog.3(this));
    helpBtn.setText(R.string.learn_more);
    return paramViewGroup;
  }
  
  void onHelp()
  {
    String str2 = Urls.getFullUrl("app-redirect/i-need-help-mic-error-android");
    String str1 = str2;
    if (getArguments() != null)
    {
      str1 = str2;
      if (getArguments().containsKey("help url")) {
        str1 = getArguments().getString("help url");
      }
    }
    Util.openInBrowser(requireContext(), str1);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    a.g("onRequestPermissionsResult: %d:\n%s\n%s", new Object[] { Integer.valueOf(paramInt), Arrays.toString(paramArrayOfString), Arrays.toString(paramArrayOfInt) });
    int i = 0;
    paramInt = 0;
    while (i < paramArrayOfString.length)
    {
      String str = paramArrayOfString[i];
      paramInt = paramArrayOfInt[i];
      if ((str.equals("android.permission.RECORD_AUDIO")) && (paramInt == 0)) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      i += 1;
    }
    if (paramInt != 0)
    {
      getViewModel().restart();
      return;
    }
    a.h("User denied audio permission", new Object[0]);
  }
}
