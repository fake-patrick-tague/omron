package com.alivecor.upgrade;

public enum AliveCorDetermination
{
  static
  {
    AliveCorDetermination localAliveCorDetermination1 = new AliveCorDetermination("NORMAL", 0);
    NORMAL = localAliveCorDetermination1;
    AliveCorDetermination localAliveCorDetermination2 = new AliveCorDetermination("AFIB", 1);
    AFIB = localAliveCorDetermination2;
    AliveCorDetermination localAliveCorDetermination3 = new AliveCorDetermination("UNCLASSIFIED", 2);
    UNCLASSIFIED = localAliveCorDetermination3;
    AliveCorDetermination localAliveCorDetermination4 = new AliveCorDetermination("BRADYCARDIA", 3);
    BRADYCARDIA = localAliveCorDetermination4;
    AliveCorDetermination localAliveCorDetermination5 = new AliveCorDetermination("TACHYCARDIA", 4);
    TACHYCARDIA = localAliveCorDetermination5;
    AliveCorDetermination localAliveCorDetermination6 = new AliveCorDetermination("SHORT", 5);
    SHORT = localAliveCorDetermination6;
    AliveCorDetermination localAliveCorDetermination7 = new AliveCorDetermination("LONG", 6);
    LONG = localAliveCorDetermination7;
    AliveCorDetermination localAliveCorDetermination8 = new AliveCorDetermination("UNREADABLE", 7);
    UNREADABLE = localAliveCorDetermination8;
    AliveCorDetermination localAliveCorDetermination9 = new AliveCorDetermination("NO_ANALYSIS", 8);
    NO_ANALYSIS = localAliveCorDetermination9;
    $VALUES = new AliveCorDetermination[] { localAliveCorDetermination1, localAliveCorDetermination2, localAliveCorDetermination3, localAliveCorDetermination4, localAliveCorDetermination5, localAliveCorDetermination6, localAliveCorDetermination7, localAliveCorDetermination8, localAliveCorDetermination9 };
  }
}
