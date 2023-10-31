package com.alivecor.mapsforge.core.model;

import l.a.a;

public enum MainsFilterFrequency
{
  public final int languageIndex;
  
  static
  {
    MainsFilterFrequency localMainsFilterFrequency1 = new MainsFilterFrequency("MAINS_60_HZ", 0, 60);
    MAINS_60_HZ = localMainsFilterFrequency1;
    MainsFilterFrequency localMainsFilterFrequency2 = new MainsFilterFrequency("MAINS_50_HZ", 1, 50);
    MAINS_50_HZ = localMainsFilterFrequency2;
    d = new MainsFilterFrequency[] { localMainsFilterFrequency1, localMainsFilterFrequency2 };
  }
  
  private MainsFilterFrequency(int paramInt)
  {
    languageIndex = paramInt;
  }
  
  public static MainsFilterFrequency fromFrequency(int paramInt)
  {
    if (paramInt == 60) {
      return MAINS_60_HZ;
    }
    if (paramInt == 50) {
      return MAINS_50_HZ;
    }
    a.h("Unsupported mains frequency: %d", new Object[] { Integer.valueOf(paramInt) });
    return MAINS_50_HZ;
  }
}
