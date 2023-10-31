package com.google.android.gms.internal.fitness;

final class zzgf
{
  private final byte[] buffer;
  private final zzgk zzuh;
  
  private zzgf(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    buffer = arrayOfByte;
    zzuh = zzgk.getByteArray(arrayOfByte);
  }
  
  public final zzfx zzaz()
  {
    if (zzuh.zzbc() == 0) {
      return new zzgh(buffer);
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  public final zzgk zzba()
  {
    return zzuh;
  }
}
