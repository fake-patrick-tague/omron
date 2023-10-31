package com.alivecor.upgrade;

import android.content.Context;
import java.util.List;
import net.danlew.android.joda.a;

public abstract class BaseAlivecorApi
{
  private final KardiaKitConfiguration apiConfiguration;
  private final String appName;
  
  protected BaseAlivecorApi(Context paramContext, String paramString1, String paramString2)
  {
    a.a(paramContext.getApplicationContext());
    paramContext = new HmacKeyConfigManager(paramString1, paramContext.getApplicationContext().getPackageName());
    if (paramContext.validateKey())
    {
      if (!paramContext.isExpired())
      {
        apiConfiguration = paramContext.configuration();
        appName = paramString2;
        return;
      }
      throw ApiKeyException.expired(paramString1, configurationexpirationDate);
    }
    throw ApiKeyException.invalidKey(paramString1);
  }
  
  public final List getSupportedDevices()
  {
    return apiConfiguration.enabledDevices;
  }
}
