package com.example.splash_screen_video;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

public class Splash extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// remove title كود ملئ الشاشة ////
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.splash);

        VideoView yousuf = findViewById(R.id.splashVideoView1);

        // String ahmad = "https://afro-muelheim.000webhostapp.com/001.mp4";
        String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.technology;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        yousuf.start();


        ///////////كود مدة ظهور شاشة الاسبلاش////////

        Integer SPLASH_TIME = 4000;
        new Handler().postDelayed(new Runnable() {

                                      //// كِوَدِ االانتقال الي الصفحة الرئيسية////
                                      @Override
                                      public void run() {

                                          Intent yousuf = new Intent(Splash.this, MainActivity.class);
                                          startActivity(yousuf);
                                          finish();
                                      }
                                  },

                SPLASH_TIME);






    }
}