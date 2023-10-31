package com.braze.ui.feed;

import com.braze.ui.feed.listeners.BrazeDefaultFeedClickActionListener;
import com.braze.ui.feed.listeners.IFeedClickActionListener;

public class BrazeFeedManager
{
  private static volatile BrazeFeedManager sInstance;
  private IFeedClickActionListener mCustomFeedClickActionListener;
  private final IFeedClickActionListener mDefaultFeedClickActionListener = new BrazeDefaultFeedClickActionListener();
  
  public BrazeFeedManager() {}
  
  public static BrazeFeedManager getInstance()
  {
    if (sInstance == null) {
      try
      {
        if (sInstance == null) {
          sInstance = new BrazeFeedManager();
        }
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
    }
    return sInstance;
  }
  
  public IFeedClickActionListener getFeedCardClickActionListener()
  {
    IFeedClickActionListener localIFeedClickActionListener = mCustomFeedClickActionListener;
    if (localIFeedClickActionListener != null) {
      return localIFeedClickActionListener;
    }
    return mDefaultFeedClickActionListener;
  }
}
