package com.google.android.gms.internal.fitness;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzfs<E>
  extends AbstractList<E>
  implements zzhh<E>
{
  private boolean zztv = true;
  
  zzfs() {}
  
  public void add(int paramInt, Object paramObject)
  {
    zzas();
    super.add(paramInt, paramObject);
  }
  
  public boolean add(Object paramObject)
  {
    zzas();
    return super.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    zzas();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    zzas();
    return super.addAll(paramCollection);
  }
  
  public void clear()
  {
    zzas();
    super.clear();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    if (!(paramObject instanceof RandomAccess)) {
      return super.equals(paramObject);
    }
    paramObject = (List)paramObject;
    int j = size();
    if (j != paramObject.size()) {
      return false;
    }
    int i = 0;
    while (i < j)
    {
      if (!get(i).equals(paramObject.get(i))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public int hashCode()
  {
    int k = size();
    int j = 1;
    int i = 0;
    while (i < k)
    {
      j = j * 31 + get(i).hashCode();
      i += 1;
    }
    return j;
  }
  
  public Object remove(int paramInt)
  {
    zzas();
    return super.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    zzas();
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    zzas();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    zzas();
    return super.retainAll(paramCollection);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    zzas();
    return super.set(paramInt, paramObject);
  }
  
  public boolean zzaq()
  {
    return zztv;
  }
  
  public final void zzar()
  {
    zztv = false;
  }
  
  protected final void zzas()
  {
    if (zztv) {
      return;
    }
    throw new UnsupportedOperationException();
  }
}
