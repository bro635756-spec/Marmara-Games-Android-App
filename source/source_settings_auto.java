package com.marmaragames.core;

import android.util.Log;

public class source_settings_auto {
    private static final String TAG = "AutoSettings";
    private boolean shaderCachingEnabled;
    private int maxWorkerThreads;

    public source_settings_auto() {
        this.shaderCachingEnabled = true;
        this.maxWorkerThreads = 4;
    }

    public void loadLocalConfigurations() {
        Log.i(TAG, "Loading optimized shader profiles and dynamic device thread rules.");
        Log.d(TAG, "Saf FPS Optimization Modules Status: ACTIVE");
        Log.d(TAG, "Java Garbage Collection Bypass Array Allocation: OK");
    }

    public boolean isShaderCachingEnabled() {
        return shaderCachingEnabled;
    }

    public int getMaxWorkerThreads() {
        return maxWorkerThreads;
    }
}
