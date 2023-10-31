package com.alivecor.mapsforge.core.model;

import l.a.a;

public enum YAxisScaleTypes
{
  static
  {
    YAxisScaleTypes localYAxisScaleTypes1 = new YAxisScaleTypes("Y_AXIS_SCALE_5", 0);
    Y_AXIS_SCALE_5 = localYAxisScaleTypes1;
    YAxisScaleTypes localYAxisScaleTypes2 = new YAxisScaleTypes("Y_AXIS_SCALE_10", 1);
    Y_AXIS_SCALE_10 = localYAxisScaleTypes2;
    YAxisScaleTypes localYAxisScaleTypes3 = new YAxisScaleTypes("Y_AXIS_SCALE_20", 2);
    Y_AXIS_SCALE_20 = localYAxisScaleTypes3;
    d = new YAxisScaleTypes[] { localYAxisScaleTypes1, localYAxisScaleTypes2, localYAxisScaleTypes3 };
  }
  
  public static int getYAxisScale(YAxisScaleTypes paramYAxisScaleTypes)
  {
    int i = a.$SwitchMap$org$mozilla$gecko$gfx$JavaPanZoomController$PanZoomState[paramYAxisScaleTypes.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          a.h("Unsupported Y-Axis Scale. Default Scale : 10", new Object[0]);
          return 10;
        }
        return 20;
      }
      return 10;
    }
    return 5;
  }
  
  public static YAxisScaleTypes getYAxisScaleTypes(int paramInt)
  {
    if (paramInt != 5)
    {
      if (paramInt != 10)
      {
        if (paramInt != 20)
        {
          a.h("Unsupported Y-Axis Scale. Default Scale : 10", new Object[0]);
          return Y_AXIS_SCALE_10;
        }
        return Y_AXIS_SCALE_20;
      }
      return Y_AXIS_SCALE_10;
    }
    return Y_AXIS_SCALE_5;
  }
}
