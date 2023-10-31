package com.alivecor.mapsforge.record;

import com.alivecor.mapsforge.core.asm.b;
import java.io.File;

public class RecordEkgConstants
{
  static final String ARG_OVERRIDE_DEVICE_NAME = "com.alivecor.ecg.record.ARG_OVERRIDE_DEVICE_NAME";
  static final String ARG_RECORD_UI_CONFIG = "com.alivecor.ecg.record.ARG_UI_CONFIG";
  public static final String EXTRA_DEVICE = "com.alivecor.ecg.record.device";
  public static final String EXTRA_FILTER_TYPE = "com.alivecor.ecg.record.EXTRA_RECORDING_FILTER_TYPE";
  public static final String EXTRA_HELP_URLS = "com.alivecor.ecg.record.HELP_URLS";
  public static final String EXTRA_HIDE_TRACE = "com.alivecor.ecg.record.EXTRA_HIDE_TRACE";
  public static final String EXTRA_LEADS_CONFIG = "com.alivecor.ecg.record.EXTRA_LEADS_CONFIG";
  public static final String EXTRA_MAX_DURATION = "com.alivecor.ecg.record.EXTRA_RECORDING_MAX_DURATIONS";
  public static final String EXTRA_MIN_DURATION = "com.alivecor.ecg.record.EXTRA_RECORDING_MIN_DURATIONS";
  public static final String EXTRA_PDF_REPORT_RAW = "com.alivecor.ecg.record.EXTRA_PDF_REPORT_RAW";
  public static final String EXTRA_RECORD_RESULT = "com.alivecor.ecg.record.result";
  public static final String EXTRA_REC_FREQUENCY = "com.alivecor.ecg.record.EXTRA_RECORDING_FREQUENCY";
  static final String EXTRA_VOICE_ENABLED = "com.alivecor.ecg.record.EXTRA_VOICE_ENABLED";
  public static final String EXTRA_Y_AXIS_SCALE = "com.alivecor.ecg.record.EXTRA_Y_AXIS_SCALE";
  public static final int RESULT_CHANGE_DEVICE = 3;
  
  public RecordEkgConstants() {}
  
  public static File defaultEcgDir()
  {
    return b.write();
  }
}
