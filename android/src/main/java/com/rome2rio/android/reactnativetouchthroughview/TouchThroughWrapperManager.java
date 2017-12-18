package com.rome2rio.android.reactnativetouchthroughview;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;


public class TouchThroughWrapperManager
        extends ViewGroupManager<TouchThroughWrapper> {

    public static final String REACT_CLASS = "R2RTouchThroughWrapper";

    public String getName() {
        return REACT_CLASS;
    }
    public TouchThroughWrapper createViewInstance(ThemedReactContext context) {
      return new TouchThroughWrapper(context);
    }
}
