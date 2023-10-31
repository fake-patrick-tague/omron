package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

final class zzkv
  extends zzkz
{
  private static final Class cls = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private zzkv()
  {
    super(null);
  }
  
  final void add(Object paramObject, long paramLong)
  {
    Object localObject = (List)zzmx.getValue(paramObject, paramLong);
    if ((localObject instanceof zzkt))
    {
      localObject = ((zzkt)localObject).a();
    }
    else
    {
      if (cls.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof zzls)) && ((localObject instanceof zzkl)))
      {
        paramObject = (zzkl)localObject;
        if (!paramObject.get()) {
          return;
        }
        paramObject.inc();
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    zzmx.add(paramObject, paramLong, localObject);
  }
  
  final void get(Object paramObject1, Object paramObject2, long paramLong)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a7\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n");
  }
}
