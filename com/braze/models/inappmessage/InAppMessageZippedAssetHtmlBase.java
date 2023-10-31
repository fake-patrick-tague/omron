package com.braze.models.inappmessage;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.g;
import kotlin.x.d.i;
import org.json.JSONException;
import org.json.JSONObject;
import protect.package_9.c;

public abstract class InAppMessageZippedAssetHtmlBase
  extends InAppMessageHtmlBase
  implements IInAppMessageZippedAssetHtml
{
  public static final a Companion = new a(null);
  private String assetsZipRemoteUrl;
  
  public InAppMessageZippedAssetHtmlBase() {}
  
  public InAppMessageZippedAssetHtmlBase(JSONObject paramJSONObject, c paramC)
  {
    super(paramJSONObject, paramC);
    paramJSONObject = paramJSONObject.optString("zipped_assets_url");
    i.d(paramJSONObject, "it");
    if ((g.o(paramJSONObject) ^ true)) {
      setAssetsZipRemoteUrl(paramJSONObject);
    }
  }
  
  public JSONObject forJsonPut()
  {
    JSONObject localJSONObject = getJsonObject();
    if (localJSONObject != null) {
      return localJSONObject;
    }
    localJSONObject = super.forJsonPut();
    try
    {
      localJSONObject.putOpt("zipped_assets_url", getAssetsZipRemoteUrl());
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public String getAssetsZipRemoteUrl()
  {
    return assetsZipRemoteUrl;
  }
  
  public List getRemoteAssetPathsForPrefetch()
  {
    ArrayList localArrayList = new ArrayList();
    String str = getAssetsZipRemoteUrl();
    if ((str != null) && ((g.o(str) ^ true))) {
      localArrayList.add(str);
    }
    return localArrayList;
  }
  
  public void setAssetsZipRemoteUrl(String paramString)
  {
    assetsZipRemoteUrl = paramString;
  }
  
  public static final class a
  {
    private a() {}
  }
}
