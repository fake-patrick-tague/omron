package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger.Priority;
import com.braze.support.PackageUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.k;
import kotlin.text.g;
import kotlin.x.c.a;
import kotlin.x.d.j;

public class CachedConfigurationProvider
{
  public static final a Companion = new a(null);
  private final Map<String, Object> configurationCache;
  private Context context;
  private final String resourcePackageName;
  private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
  private boolean shouldUseConfigurationCache;
  
  public CachedConfigurationProvider(Context paramContext, boolean paramBoolean, RuntimeAppConfigurationProvider paramRuntimeAppConfigurationProvider)
  {
    context = paramContext;
    shouldUseConfigurationCache = paramBoolean;
    runtimeAppConfigurationProvider = paramRuntimeAppConfigurationProvider;
    paramContext = Collections.synchronizedMap(new HashMap());
    kotlin.x.d.i.d(paramContext, "synchronizedMap(HashMap())");
    configurationCache = paramContext;
    resourcePackageName = PackageUtils.getResourcePackageName(context);
  }
  
  private final String getFallbackConfigKey(String paramString)
  {
    if (g.y(paramString, "braze", false, 2, null)) {
      return g.r(paramString, "braze", "appboy", false, 4, null);
    }
    return null;
  }
  
  private final int getResourceIdentifier(String paramString, b paramB)
  {
    if (paramString == null) {
      return 0;
    }
    return context.getResources().getIdentifier(paramString, paramB.getImageName(), resourcePackageName);
  }
  
  public final boolean getBooleanValue(String paramString, boolean paramBoolean)
  {
    kotlin.x.d.i.e(paramString, "primaryKey");
    paramString = getConfigurationValue(b.height, paramString, Boolean.valueOf(paramBoolean));
    Objects.requireNonNull(paramString, "null cannot be cast to non-null type kotlin.Boolean");
    return ((Boolean)paramString).booleanValue();
  }
  
  public final Integer getColorValue(String paramString)
  {
    kotlin.x.d.i.e(paramString, "primaryKey");
    return (Integer)getConfigurationValue(b.bottom, paramString, null);
  }
  
  public final Map getConfigurationCache()
  {
    return configurationCache;
  }
  
  public final Object getConfigurationValue(b paramB, String paramString, Object paramObject)
  {
    kotlin.x.d.i.e(paramB, "type");
    kotlin.x.d.i.e(paramString, "key");
    if ((shouldUseConfigurationCache) && (configurationCache.containsKey(paramString))) {
      return configurationCache.get(paramString);
    }
    if (runtimeAppConfigurationProvider.containsKey(paramString)) {
      return getRuntimeConfigurationValue(paramB, paramString, paramObject);
    }
    return getResourceConfigurationValue(paramB, paramString, paramObject);
  }
  
  protected final int getDrawableValue(String paramString, int paramInt)
  {
    kotlin.x.d.i.e(paramString, "primaryKey");
    paramString = getConfigurationValue(b.width, paramString, Integer.valueOf(paramInt));
    Objects.requireNonNull(paramString, "null cannot be cast to non-null type kotlin.Int");
    return ((Integer)paramString).intValue();
  }
  
  public final int getIntValue(String paramString, int paramInt)
  {
    kotlin.x.d.i.e(paramString, "primaryKey");
    paramString = getConfigurationValue(b.overflow, paramString, Integer.valueOf(paramInt));
    Objects.requireNonNull(paramString, "null cannot be cast to non-null type kotlin.Int");
    return ((Integer)paramString).intValue();
  }
  
  protected final Object getResourceConfigurationValue(final b paramB, String paramString, Object paramObject)
  {
    kotlin.x.d.i.e(paramB, "type");
    kotlin.x.d.i.e(paramString, "key");
    paramB = readResourceValue(paramB, paramString, paramObject);
    configurationCache.put(paramString, paramB);
    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, null, null, new d(paramString, paramB), 3, null);
    return paramB;
  }
  
  public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider()
  {
    return runtimeAppConfigurationProvider;
  }
  
  protected final Object getRuntimeConfigurationValue(final b paramB, String paramString, Object paramObject)
  {
    kotlin.x.d.i.e(paramB, "type");
    kotlin.x.d.i.e(paramString, "key");
    switch (c.DIGITS_POWER[paramB.ordinal()])
    {
    default: 
      throw ((Throwable)new k());
    case 6: 
      paramB = Integer.valueOf(getResourceIdentifier(runtimeAppConfigurationProvider.getStringValue(paramString, ""), b.width));
      break;
    case 4: 
    case 5: 
      int i;
      if (paramObject == null) {
        i = runtimeAppConfigurationProvider.getIntValue(paramString, 0);
      } else {
        i = runtimeAppConfigurationProvider.getIntValue(paramString, ((Integer)paramObject).intValue());
      }
      paramB = Integer.valueOf(i);
      break;
    case 3: 
      paramB = runtimeAppConfigurationProvider;
      Objects.requireNonNull(paramObject, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
      paramB = paramB.getStringSetValue(paramString, (Set)paramObject);
      break;
    case 2: 
      paramB = runtimeAppConfigurationProvider.getStringValue(paramString, (String)paramObject);
      break;
    case 1: 
      paramB = runtimeAppConfigurationProvider;
      Objects.requireNonNull(paramObject, "null cannot be cast to non-null type kotlin.Boolean");
      paramB = Boolean.valueOf(paramB.getBooleanValue(paramString, ((Boolean)paramObject).booleanValue()));
    }
    configurationCache.put(paramString, paramB);
    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, null, null, new e(paramString, paramB), 3, null);
    return paramB;
  }
  
  public final Set getStringSetValue(String paramString, Set paramSet)
  {
    kotlin.x.d.i.e(paramString, "primaryKey");
    paramString = getConfigurationValue(b.style, paramString, paramSet);
    if (paramString == null) {
      return paramSet;
    }
    return (Set)paramString;
  }
  
  public final String getStringValue(String paramString1, String paramString2)
  {
    kotlin.x.d.i.e(paramString1, "primaryKey");
    return (String)getConfigurationValue(b.y, paramString1, paramString2);
  }
  
  public final Object getValueFromResources(b paramB, int paramInt)
  {
    kotlin.x.d.i.e(paramB, "type");
    Resources localResources = context.getResources();
    switch (c.DIGITS_POWER[paramB.ordinal()])
    {
    default: 
      throw ((Throwable)new k());
    case 6: 
      return Integer.valueOf(paramInt);
    case 5: 
      return Integer.valueOf(localResources.getColor(paramInt));
    case 4: 
      return Integer.valueOf(localResources.getInteger(paramInt));
    case 3: 
      paramB = localResources.getStringArray(paramInt);
      kotlin.x.d.i.d(paramB, "resources.getStringArray(resourceId)");
      return new HashSet(kotlin.collections.i.f(Arrays.copyOf(paramB, paramB.length)));
    case 2: 
      paramB = localResources.getString(paramInt);
      kotlin.x.d.i.d(paramB, "resources.getString(resourceId)");
      return paramB;
    }
    return Boolean.valueOf(localResources.getBoolean(paramInt));
  }
  
  public final Object readResourceValue(b paramB, final String paramString, final Object paramObject)
  {
    kotlin.x.d.i.e(paramB, "type");
    kotlin.x.d.i.e(paramString, "key");
    try
    {
      int i = getResourceIdentifier(paramString, paramB);
      if (i != 0)
      {
        localObject = getValueFromResources(paramB, i);
        return localObject;
      }
      Object localObject = getFallbackConfigKey(paramString);
      if (localObject == null)
      {
        localObject = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default((BrazeLogger)localObject, this, null, null, new f(paramString, paramObject), 3, null);
        return paramObject;
      }
      i = getResourceIdentifier((String)localObject, paramB);
      if (i != 0)
      {
        localObject = getValueFromResources(paramB, i);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.this$0, localException, g.PREPARED);
      BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, null, null, new h(paramB, paramString, paramObject), 3, null);
    }
    return paramObject;
  }
  
  public static final class a
  {
    private a() {}
  }
  
  public static enum b
  {
    private final String imageName;
    
    static
    {
      bottom = new b("COLOR", 1, "color");
      height = new b("BOOLEAN", 2, "bool");
      y = new b("STRING", 3, "string");
      width = new b("DRAWABLE_IDENTIFIER", 4, "drawable");
    }
    
    private b(String paramString)
    {
      imageName = paramString;
    }
    
    public final String getImageName()
    {
      return imageName;
    }
  }
  
  static final class d
    extends j
    implements a<String>
  {
    d(String paramString, Object paramObject)
    {
      super();
    }
    
    public final String request()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Using resources value for key: '");
      localStringBuilder.append(mUserId);
      localStringBuilder.append("' and value: '");
      localStringBuilder.append(paramB);
      localStringBuilder.append('\'');
      return localStringBuilder.toString();
    }
  }
  
  static final class e
    extends j
    implements a<String>
  {
    e(String paramString, Object paramObject)
    {
      super();
    }
    
    public final String request()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Using runtime override value for key: '");
      localStringBuilder.append(mUserId);
      localStringBuilder.append("' and value: '");
      localStringBuilder.append(paramB);
      localStringBuilder.append('\'');
      return localStringBuilder.toString();
    }
  }
  
  static final class f
    extends j
    implements a<String>
  {
    f(String paramString, Object paramObject)
    {
      super();
    }
    
    public final String request()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Primary key '");
      localStringBuilder.append(mUserId);
      localStringBuilder.append("' had no identifier. No secondary key to read resource value. Returning default value: '");
      localStringBuilder.append(paramObject);
      localStringBuilder.append('\'');
      return localStringBuilder.toString();
    }
  }
  
  static final class g
    extends j
    implements a<String>
  {
    public static final g PREPARED = new g();
    
    g()
    {
      super();
    }
    
    public final String getText()
    {
      return "Caught exception retrieving resource value";
    }
  }
  
  static final class h
    extends j
    implements a<String>
  {
    h(CachedConfigurationProvider.b paramB, String paramString, Object paramObject)
    {
      super();
    }
    
    public final String getValue()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unable to find the xml ");
      localStringBuilder.append(mIndex);
      localStringBuilder.append(" configuration value with primary key '");
      localStringBuilder.append(paramString);
      localStringBuilder.append("'. Using default value '");
      localStringBuilder.append(paramObject);
      localStringBuilder.append("'.");
      return localStringBuilder.toString();
    }
  }
}
