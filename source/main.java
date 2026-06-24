package com.marmaragames.core;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class main extends Activity {
    private static final String TAG = "MarmaraGames_Main";
    private source_settings_auto settingsAuto;

    // Native C++ Metot Bildirimleri (JNI Köprüsü)
    public native void initNativeCore();
    public native void processBanaRauntMatchmaking();
    public native boolean isSunAIPipelineRunning();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate();
        Log.i(TAG, "Launching Cyberpunk UI Application View Layer...");

        // Sistem durum kontrolü
        android.printSystemDiagnostics();

        // Ayarların otomatik yüklenmesi
        settingsAuto = new source_settings_auto();
        settingsAuto.loadLocalConfigurations();

        // Arka plan işçileri (SunAI) başlatılması
        startSunAIEngine();

        Toast.makeText(this, "Marmara Games Platformuna Hoş Geldiniz", Toast.LENGTH_LONG).show();
    }

    private void startSunAIEngine() {
        // SunAI arka plan rutinleri UI'ı bloke etmemek için asenkron bir worker thread üzerinde çalıştırılır.
        Thread sunAIWorker = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                Log.i(TAG, "SunAI Background Routine triggered on explicit priority worker thread.");
                
                // JNI üzerinden C++ katmanındaki BanaRaunt statik dizileri yönetilir
                try {
                    initNativeCore();
                    processBanaRauntMatchmaking();
                } catch (UnsatisfiedLinkError e) {
                    Log.w(TAG, "JNI Runtime: Using simulated core pipeline (Native build not compiled yet).");
                }
            }
        });
        sunAIWorker.start();
    }
  }
                      
