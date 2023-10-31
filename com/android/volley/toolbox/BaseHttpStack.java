package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class BaseHttpStack
  implements HttpStack
{
  public BaseHttpStack() {}
  
  public abstract HttpResponse executeRequest(Request paramRequest, Map paramMap)
    throws IOException, AuthFailureError;
  
  public final org.apache.http.HttpResponse performRequest(Request paramRequest, Map paramMap)
    throws IOException, AuthFailureError
  {
    paramRequest = executeRequest(paramRequest, paramMap);
    paramMap = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), paramRequest.getStatusCode(), ""));
    Object localObject1 = new ArrayList();
    Object localObject2 = paramRequest.getHeaders().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      com.android.volley.Header localHeader = (com.android.volley.Header)((Iterator)localObject2).next();
      ((List)localObject1).add(new BasicHeader(localHeader.getName(), localHeader.getValue()));
    }
    paramMap.setHeaders((org.apache.http.Header[])((List)localObject1).toArray(new org.apache.http.Header[0]));
    localObject1 = paramRequest.getContent();
    if (localObject1 != null)
    {
      localObject2 = new BasicHttpEntity();
      ((BasicHttpEntity)localObject2).setContent((InputStream)localObject1);
      ((BasicHttpEntity)localObject2).setContentLength(paramRequest.getContentLength());
      paramMap.setEntity((HttpEntity)localObject2);
    }
    return paramMap;
  }
}
