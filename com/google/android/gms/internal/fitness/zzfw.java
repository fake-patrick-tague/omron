package com.google.android.gms.internal.fitness;

import java.util.NoSuchElementException;

final class zzfw
  extends zzfy
{
  private final int limit;
  private int position = 0;
  
  zzfw(zzfx paramZzfx)
  {
    limit = paramZzfx.size();
  }
  
  public final boolean hasNext()
  {
    return position < limit;
  }
  
  public final byte nextByte()
  {
    int i = position;
    if (i < limit)
    {
      position = (i + 1);
      return zzua.nextValue(i);
    }
    throw new NoSuchElementException();
  }
}
