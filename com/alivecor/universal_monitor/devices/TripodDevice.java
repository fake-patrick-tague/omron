package com.alivecor.universal_monitor.devices;

import android.os.Handler;
import android.os.Looper;
import com.alivecor.universal_monitor.audio.AudioBuffer;
import com.alivecor.universal_monitor.audio.AudioInput;
import com.alivecor.universal_monitor.audio.AudioInputCallback;

public class TripodDevice
  extends Device
{
  private AudioInput audioInput;
  private AudioInputCallback callback;
  private boolean capturing;
  private Handler handler;
  
  public TripodDevice()
  {
    AudioInputCallback local1 = new AudioInputCallback()
    {
      public void receivedAudioSamples(AudioBuffer paramAnonymousAudioBuffer)
      {
        handler.post(new b(this, paramAnonymousAudioBuffer));
      }
    };
    callback = local1;
    recorderHardware = "tripod";
    capturing = false;
    audioInput = new AudioInput(local1);
    handler = new Handler(Looper.getMainLooper());
    init(audioInput.getSampleRate());
  }
  
  private native void init(int paramInt);
  
  private native void processAudioSamples(float[] paramArrayOfFloat, int paramInt);
  
  public void startCapturing()
  {
    audioInput.start();
    capturing = true;
  }
  
  public void stopCapturing()
  {
    audioInput.stop();
    capturing = false;
  }
}
