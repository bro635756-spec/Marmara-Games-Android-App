package com.marmaragames.core;

import android.os.Build;
import android.util.Log;

public class android {
    private static final String TAG = "Android_System_Check";

    public static void printSystemDiagnostics() {
        Log.i(TAG, "=== MARMARA GAMES HARDWARE DIAGNOSTICS ===");
        Log.i(TAG, "OS Version: Android " + Build.VERSION.RELEASE);
        Log.i(TAG, "Device Model: " + Build.MODEL);
        Log.i(TAG, "Hardware Board: " + Build.BOARD);
        Log.i(TAG, "Supported ABIs: " + String.join(", ", Build.SUPPORTED_ABIS));
    }
}
