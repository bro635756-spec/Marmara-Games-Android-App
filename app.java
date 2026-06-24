package com.marmaragames.core;

import android.app.Application;
import android.util.Log;

public class app extends Application {
    private static final String TAG = "MarmaraGames_App";

    static {
        // C++ Çekirdek motorunun ve yerel bellek katmanının yüklenmesi
        try {
            System.loadLibrary("marmara_core");
            Log.i(TAG, "Native C++ Core engine successfully loaded.");
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Failed to load native C++ library: " + e.getMessage());
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Marmara Games Android Hub Initialized.");
    }
  }
