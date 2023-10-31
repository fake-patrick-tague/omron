package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzch
  extends zzbn
  implements zzci
{
  public zzch()
  {
    super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
  }
  
  protected final boolean getFromLocationName(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = get();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    String str1 = paramParcel1.readString();
    String str2 = paramParcel1.readString();
    Bundle localBundle = (Bundle)zzbo.get(paramParcel1, Bundle.CREATOR);
    long l = paramParcel1.readLong();
    zzbo.writeString(paramParcel1);
    sendHit(str1, str2, localBundle, l);
    paramParcel2.writeNoException();
    return true;
  }
}
