package com.braze.enums;

import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger.Priority;
import kotlin.x.c.a;
import kotlin.x.d.j;

public enum Month
{
  public static final Companion Companion = new Companion(null);
  private final int value;
  
  static
  {
    FEBRUARY = new Month("FEBRUARY", 1, 1);
    MARCH = new Month("MARCH", 2, 2);
    APRIL = new Month("APRIL", 3, 3);
    MAY = new Month("MAY", 4, 4);
    JUNE = new Month("JUNE", 5, 5);
    JULY = new Month("JULY", 6, 6);
    AUGUST = new Month("AUGUST", 7, 7);
    SEPTEMBER = new Month("SEPTEMBER", 8, 8);
    OCTOBER = new Month("OCTOBER", 9, 9);
    NOVEMBER = new Month("NOVEMBER", 10, 10);
    DECEMBER = new Month("DECEMBER", 11, 11);
  }
  
  private Month(int paramInt)
  {
    value = paramInt;
  }
  
  public final int getValue()
  {
    return value;
  }
  
  public static final class Companion
  {
    private Companion() {}
    
    public final Month getMonth(int paramInt)
    {
      Month[] arrayOfMonth = Month.values();
      int k = arrayOfMonth.length;
      int j = 0;
      while (j < k)
      {
        localMonth = arrayOfMonth[j];
        j += 1;
        int i;
        if (localMonth.getValue() == paramInt) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          break label54;
        }
      }
      Month localMonth = null;
      label54:
      if (localMonth == null)
      {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.PREPARED, null, new a(paramInt), 2, null);
        return null;
      }
      return localMonth;
    }
    
    static final class a
      extends j
      implements a<String>
    {
      a(int paramInt)
      {
        super();
      }
      
      public final String substring()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("No month with value ");
        localStringBuilder.append(src);
        localStringBuilder.append(", value must be in (0,11)");
        return localStringBuilder.toString();
      }
    }
  }
}
