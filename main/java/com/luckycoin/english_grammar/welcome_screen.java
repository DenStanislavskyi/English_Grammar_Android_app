package com.luckycoin.english_grammar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class welcome_screen extends Activity {
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
    Thread welcomeTread;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomescreen);
        StartAnimations();
    }
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_welcome);
        l.clearAnimation();
        l.startAnimation(anim);
        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.welcome);
        iv.clearAnimation();
        iv.startAnimation(anim);
        welcomeTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3300) {
                        sleep(150);
                        waited += 100;
                    }
                    Intent intent = new Intent(welcome_screen.this,
                            Main.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    welcome_screen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    welcome_screen.this.finish();
                }

            }
        };
        welcomeTread.start();
    }
}