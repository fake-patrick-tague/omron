package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class NetworkResponse
{
  public final List<Header> allHeaders;
  public final byte[] data;
  public final Map<String, String> headers;
  public final long networkTimeMs;
  public final boolean notModified;
  public final int statusCode;
  
  private NetworkResponse(int paramInt, byte[] paramArrayOfByte, Map paramMap, List paramList, boolean paramBoolean, long paramLong)
  {
    statusCode = paramInt;
    data = paramArrayOfByte;
    headers = paramMap;
    if (paramList == null) {
      allHeaders = null;
    } else {
      allHeaders = Collections.unmodifiableList(paramList);
    }
    notModified = paramBoolean;
    networkTimeMs = paramLong;
  }
  
  public NetworkResponse(int paramInt, byte[] paramArrayOfByte, Map paramMap, boolean paramBoolean)
  {
    this(paramInt, paramArrayOfByte, paramMap, paramBoolean, 0L);
  }
  
  public NetworkResponse(int paramInt, byte[] paramArrayOfByte, Map paramMap, boolean paramBoolean, long paramLong)
  {
    this(paramInt, paramArrayOfByte, paramMap, toAllHeaderList(paramMap), paramBoolean, paramLong);
  }
  
  public NetworkResponse(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean, long paramLong, List paramList)
  {
    this(paramInt, paramArrayOfByte, toHeaderMap(paramList), paramList, paramBoolean, paramLong);
  }
  
  public NetworkResponse(byte[] paramArrayOfByte)
  {
    this(200, paramArrayOfByte, false, 0L, Collections.emptyList());
  }
  
  public NetworkResponse(byte[] paramArrayOfByte, Map paramMap)
  {
    this(200, paramArrayOfByte, paramMap, false, 0L);
  }
  
  private static List toAllHeaderList(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    if (paramMap.isEmpty()) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList(paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localArrayList.add(new Header((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
    return localArrayList;
  }
  
  private static Map toHeaderMap(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    if (paramList.isEmpty()) {
      return Collections.emptyMap();
    }
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Header localHeader = (Header)paramList.next();
      localTreeMap.put(localHeader.getName(), localHeader.getValue());
    }
    return localTreeMap;
  }
}
