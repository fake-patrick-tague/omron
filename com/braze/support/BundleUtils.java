package com.braze.support;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.x.d.i;

public final class BundleUtils
{
  public static final Bundle toBundle(Map paramMap)
  {
    i.e(paramMap, "<this>");
    Bundle localBundle = new Bundle();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localBundle.putString((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localBundle;
  }
  
  public static final Map toStringMap(Bundle paramBundle)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramBundle == null) {
      return localLinkedHashMap;
    }
    Object localObject1 = paramBundle.keySet();
    i.d(localObject1, "this.keySet()");
    localObject1 = ((Set)localObject1).iterator();
    for (;;)
    {
      String str;
      if (((Iterator)localObject1).hasNext()) {
        str = (String)((Iterator)localObject1).next();
      }
      try
      {
        Object localObject2 = paramBundle.get(str);
        if ((localObject2 == null) || (!(localObject2 instanceof String))) {
          continue;
        }
        localLinkedHashMap.put(str, localObject2);
      }
      catch (Exception localException) {}
      paramBundle = Collections.unmodifiableMap(localLinkedHashMap);
      i.d(paramBundle, "unmodifiableMap(mapForm)");
      return paramBundle;
    }
  }
}
