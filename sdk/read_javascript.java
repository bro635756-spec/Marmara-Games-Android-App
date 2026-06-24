package com.marmaragames.sdk;

import android.util.Log;
import android.webkit.WebView;

public class read_javascript {
    private static final String TAG = "SDK_JS_Reader";

    public static void executeBridgeScript(WebView webView, String scriptPath) {
        Log.d(TAG, "Loading core JavaScript bridge configuration into WebView context.");
        // WebView üzerinden js bileşenlerinin yerel tetikleyicilerini bağlar
        webView.post(new Runnable() {
            @Override
            public void run() {
                webView.evaluateJavascript("javascript:if(typeof HLSController !== 'undefined') HLSController.initializeStream();", null);
            }
        });
    }
}
