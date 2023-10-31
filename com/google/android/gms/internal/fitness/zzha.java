package com.google.android.gms.internal.fitness;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzha
  extends zzfs<Integer>
  implements zzhh<Integer>, zzit, RandomAccess
{
  private static final zzha zzyb;
  private int size;
  private int[] zzyc;
  
  static
  {
    zzha localZzha = new zzha(new int[0], 0);
    zzyb = localZzha;
    localZzha.zzar();
  }
  
  zzha()
  {
    this(new int[10], 0);
  }
  
  private zzha(int[] paramArrayOfInt, int paramInt)
  {
    zzyc = paramArrayOfInt;
    size = paramInt;
  }
  
  private final void zzac(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzad(paramInt));
  }
  
  private final String zzad(int paramInt)
  {
    int i = size;
    StringBuilder localStringBuilder = new StringBuilder(35);
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public static zzha zzcb()
  {
    return zzyb;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zzas();
    zzhc.checkNotNull(paramCollection);
    if (!(paramCollection instanceof zzha)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzha)paramCollection;
    int i = size;
    if (i == 0) {
      return false;
    }
    int j = size;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      int[] arrayOfInt = zzyc;
      if (i > arrayOfInt.length) {
        zzyc = Arrays.copyOf(arrayOfInt, i);
      }
      System.arraycopy(zzyc, 0, zzyc, size, size);
      size = i;
      modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject)
  {
    return indexOf(paramObject) != -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzha)) {
      return super.equals(paramObject);
    }
    paramObject = (zzha)paramObject;
    if (size != size) {
      return false;
    }
    paramObject = zzyc;
    int i = 0;
    while (i < size)
    {
      if (zzyc[i] != paramObject[i]) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public final int getInt(int paramInt)
  {
    zzac(paramInt);
    return zzyc[paramInt];
  }
  
  public final int hashCode()
  {
    int j = 1;
    int i = 0;
    while (i < size)
    {
      j = j * 31 + zzyc[i];
      i += 1;
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Integer)) {
      return -1;
    }
    int j = ((Integer)paramObject).intValue();
    int k = size();
    int i = 0;
    while (i < k)
    {
      if (zzyc[i] == j) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2)
  {
    zzas();
    if (paramInt2 >= paramInt1)
    {
      int[] arrayOfInt = zzyc;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, size - paramInt2);
      size -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return size;
  }
}
