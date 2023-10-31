package com.alivecor.mapsforge.record;

import androidx.lifecycle.Label;
import androidx.lifecycle.StatusPreference;
import androidx.lifecycle.s;

public class RecordEKGViewModel
  extends Label
{
  private RecordingConfig recordingConfig;
  private RecordingSettings recordingSettings;
  s<com.alivecor.ecg.record.RecordEKGViewModel.RecordUIScreenTask> taskID = new StatusPreference();
  
  public RecordEKGViewModel() {}
  
  public RecordingConfig getRecordingConfig()
  {
    return recordingConfig;
  }
  
  public RecordingSettings getRecordingSettings()
  {
    return recordingSettings;
  }
  
  public void setRecordingConfig(RecordingConfig paramRecordingConfig)
  {
    recordingConfig = paramRecordingConfig;
  }
  
  public void setRecordingSettings(RecordingSettings paramRecordingSettings)
  {
    recordingSettings = paramRecordingSettings;
  }
  
  enum RecordUIScreenTask
  {
    static
    {
      RecordUIScreenTask localRecordUIScreenTask1 = new RecordUIScreenTask("UPDATE_BPM", 0);
      UPDATE_BPM = localRecordUIScreenTask1;
      RecordUIScreenTask localRecordUIScreenTask2 = new RecordUIScreenTask("UPDATE_RECORDING_TIME", 1);
      UPDATE_RECORDING_TIME = localRecordUIScreenTask2;
      RecordUIScreenTask localRecordUIScreenTask3 = new RecordUIScreenTask("UPDATE_BATTERY_SIGNAL", 2);
      UPDATE_BATTERY_SIGNAL = localRecordUIScreenTask3;
      RecordUIScreenTask localRecordUIScreenTask4 = new RecordUIScreenTask("RESET_RECORDING_UI", 3);
      RESET_RECORDING_UI = localRecordUIScreenTask4;
      RecordUIScreenTask localRecordUIScreenTask5 = new RecordUIScreenTask("SHOW_KARDIA_INTRO_HUD", 4);
      SHOW_KARDIA_INTRO_HUD = localRecordUIScreenTask5;
      RecordUIScreenTask localRecordUIScreenTask6 = new RecordUIScreenTask("SHOW_TRIANGLE_INTRO_HUD", 5);
      SHOW_TRIANGLE_INTRO_HUD = localRecordUIScreenTask6;
      RecordUIScreenTask localRecordUIScreenTask7 = new RecordUIScreenTask("SHOW_NFC_ERROR_HUD", 6);
      SHOW_NFC_ERROR_HUD = localRecordUIScreenTask7;
      RecordUIScreenTask localRecordUIScreenTask8 = new RecordUIScreenTask("SHOW_BLUETOOTH_ERROR_HUD", 7);
      SHOW_BLUETOOTH_ERROR_HUD = localRecordUIScreenTask8;
      RecordUIScreenTask localRecordUIScreenTask9 = new RecordUIScreenTask("SHOW_MIC_PERMISSION_ERROR_HUD", 8);
      SHOW_MIC_PERMISSION_ERROR_HUD = localRecordUIScreenTask9;
      RecordUIScreenTask localRecordUIScreenTask10 = new RecordUIScreenTask("SHOW_LOCATION_PERMISSION_ERROR_HUD", 9);
      SHOW_LOCATION_PERMISSION_ERROR_HUD = localRecordUIScreenTask10;
      RecordUIScreenTask localRecordUIScreenTask11 = new RecordUIScreenTask("REQUEST_ENABLE_LOCATION", 10);
      REQUEST_ENABLE_LOCATION = localRecordUIScreenTask11;
      RecordUIScreenTask localRecordUIScreenTask12 = new RecordUIScreenTask("SHOW_TRIANGLE_BATTERY_ERROR_HUD", 11);
      SHOW_TRIANGLE_BATTERY_ERROR_HUD = localRecordUIScreenTask12;
      RecordUIScreenTask localRecordUIScreenTask13 = new RecordUIScreenTask("SHOW_TRAINGLE_CONNECTION_ERROR_HUD", 12);
      SHOW_TRAINGLE_CONNECTION_ERROR_HUD = localRecordUIScreenTask13;
      RecordUIScreenTask localRecordUIScreenTask14 = new RecordUIScreenTask("SHOW_MAINS_NOISE_ERROR_HUD", 13);
      SHOW_MAINS_NOISE_ERROR_HUD = localRecordUIScreenTask14;
      RecordUIScreenTask localRecordUIScreenTask15 = new RecordUIScreenTask("SHOW_TOAST", 14);
      SHOW_TOAST = localRecordUIScreenTask15;
      $VALUES = new RecordUIScreenTask[] { localRecordUIScreenTask1, localRecordUIScreenTask2, localRecordUIScreenTask3, localRecordUIScreenTask4, localRecordUIScreenTask5, localRecordUIScreenTask6, localRecordUIScreenTask7, localRecordUIScreenTask8, localRecordUIScreenTask9, localRecordUIScreenTask10, localRecordUIScreenTask11, localRecordUIScreenTask12, localRecordUIScreenTask13, localRecordUIScreenTask14, localRecordUIScreenTask15 };
    }
  }
}
