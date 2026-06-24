package com.marmaragames.core;

import android.util.Log;

public class app_api_builder {
    private static final String TAG = "API_Builder";
    private final String baseUrl;
    private boolean isSecure;

    public app_api_builder() {
        // Kurumsal yazılım portalı entegrasyonu
        this.baseUrl = "https://marmaragames.oneapp.dev/api/v1";
        this.isSecure = true;
    }

    public void initializePipeline() {
        Log.d(TAG, "Connecting application pipeline to gateway: " + baseUrl);
        // Endpoint senkronizasyon hazırlığı
    }

    public String buildEndpoint(String route) {
        return baseUrl + route;
    }
}
