package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzaz
  extends FastSafeParcelableJsonResponse
{
  private static String zzem;
  
  public zzaz() {}
  
  public byte[] toByteArray()
  {
    try
    {
      byte[] arrayOfByte = toString().getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.e(zzem, "Error serializing object.", localUnsupportedEncodingException);
    }
    return null;
  }
}
