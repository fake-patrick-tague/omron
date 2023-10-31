package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ByteArrayPool
{
  protected static final Comparator<byte[]> BUF_COMPARATOR = new Comparator()
  {
    public int compare(byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2)
    {
      return paramAnonymousArrayOfByte1.length - paramAnonymousArrayOfByte2.length;
    }
  };
  private final List<byte[]> mBuffersByLastUse = new ArrayList();
  private final List<byte[]> mBuffersBySize = new ArrayList(64);
  private int mCurrentSize = 0;
  private final int mSizeLimit;
  
  public ByteArrayPool(int paramInt)
  {
    mSizeLimit = paramInt;
  }
  
  private void trim()
  {
    try
    {
      while (mCurrentSize > mSizeLimit)
      {
        byte[] arrayOfByte = (byte[])mBuffersByLastUse.remove(0);
        mBuffersBySize.remove(arrayOfByte);
        mCurrentSize -= arrayOfByte.length;
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
  
  public byte[] getBuf(int paramInt)
  {
    int i = 0;
    try
    {
      while (i < mBuffersBySize.size())
      {
        arrayOfByte = (byte[])mBuffersBySize.get(i);
        if (arrayOfByte.length >= paramInt)
        {
          mCurrentSize -= arrayOfByte.length;
          mBuffersBySize.remove(i);
          mBuffersByLastUse.remove(arrayOfByte);
          return arrayOfByte;
        }
        i += 1;
      }
      byte[] arrayOfByte = new byte[paramInt];
      return arrayOfByte;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
  
  public void returnBuf(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        if (paramArrayOfByte.length <= mSizeLimit)
        {
          mBuffersByLastUse.add(paramArrayOfByte);
          int j = Collections.binarySearch(mBuffersBySize, paramArrayOfByte, BUF_COMPARATOR);
          int i = j;
          if (j < 0) {
            i = -j - 1;
          }
          mBuffersBySize.add(i, paramArrayOfByte);
          mCurrentSize += paramArrayOfByte.length;
          trim();
          return;
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        throw paramArrayOfByte;
      }
    }
  }
}
