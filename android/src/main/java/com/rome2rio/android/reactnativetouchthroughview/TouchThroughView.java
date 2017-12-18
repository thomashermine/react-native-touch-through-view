package com.rome2rio.android.reactnativetouchthroughview;

import android.view.MotionEvent;
import android.content.Context;

import com.facebook.react.views.view.ReactViewGroup;

public class TouchThroughView extends ReactViewGroup {
  public TouchThroughView(Context context) {
    super(context);
  }

  public boolean onInterceptTouchEvent(MotionEvent event) {
    return true;
  }

  public boolean onTouchEvent(MotionEvent event) {
    return true;
  }
}
