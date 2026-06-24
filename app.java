package com.marmaragames.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Window;
import android.view.WindowManager;

// 1. ANA UYGULAMA SINIFI (Activity)
public class app extends Activity {
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Tam ekran modu (Profesyonel oyunlar için)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        // Oyunun çizim ekranını başlat ve ekrana bas
        gameView = new GameView(this);
        setContentView(gameView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    // 2. OYUN MOTORU VE ÇİZİM ALANI (GameView)
    class GameView extends SurfaceView implements Runnable {
        private Thread gameThread = null;
        private SurfaceHolder surfaceHolder;
        private volatile boolean isPlaying;
        
        // Çizim araçları
        private Canvas canvas;
        private Paint paint;

        public GameView(Context context) {
            super(context);
            surfaceHolder = getHolder();
            paint = new Paint();
        }

        // Profesyonel Game Loop (Oyun Döngüsü)
        @Override
        public void run() {
            while (isPlaying) {
                if (!surfaceHolder.getSurface().isValid()) {
                    continue;
                }

                // 1. Ekranı Kilitle ve Çizime Hazırla
                canvas = surfaceHolder.lockCanvas();
                
                // 2. Arka Planı Temizle (Gamer Siyahı)
                canvas.drawColor(Color.parseColor("#0B0C10"));

                // 3. Ekrana Profesyonel Arayüz Elementleri Çiz
                paint.setColor(Color.parseColor("#66FCF1")); // Neon Turkuaz
                paint.setTextSize(60);
                paint.setAntiAlias(true);
                
                canvas.drawText("MARMARA GAMES ENGINE", 100, 200, paint);
                
                paint.setColor(Color.GRAY);
                paint.setTextSize(40);
                canvas.drawText("Status: Cloud System Active", 100, 300, paint);

                // 4. Çizimi Tamamla ve Ekrana Bas
                surfaceHolder.unlockCanvasAndPost(canvas);

                // FPS Sınırlama (Telefonu yormamak için ~60 FPS)
                try {
                    Thread.sleep(16);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Döngüyü Başlat
        public void resume() {
            isPlaying = true;
            gameThread = new Thread(this);
            gameThread.start();
        }

        // Döngüyü Durdur
        public void pause() {
            isPlaying = false;
            try {
                gameThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
