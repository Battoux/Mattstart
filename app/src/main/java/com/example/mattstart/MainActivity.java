package com.example.mattstart;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mattstart.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    static MediaPlayer player;
    static MediaPlayer navi;
    public int tiempo= 30;
    public CountDownTimer cuentaregresiva = new CountDownTimer(30000, 10000) {


        public void onTick(long millisUntilFinished) {
            if(millisUntilFinished<=20000) {
                navi = MediaPlayer.create(getApplicationContext(), R.raw.heylisten);
                navi.setOnPreparedListener(MediaPlayer::start);
                navi.setOnCompletionListener(MediaPlayer::release);
                Toast.makeText(getApplicationContext(), "Llevas "+tiempo+ " minutos en la aplicacion,descansa un rato", Toast.LENGTH_LONG).show();
                tiempo+=30;
            }

        }

        public void onFinish() {
            navi = MediaPlayer.create(getApplicationContext(), R.raw.heylisten);
            navi.setOnPreparedListener(MediaPlayer::start);
            navi.setOnCompletionListener(MediaPlayer::release);
            Toast.makeText(getApplicationContext(),"Ultimo aviso llevas "+tiempo+" minutos deberias descansar",Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        cuentaregresiva.cancel();
        tiempo=30;
    }

    @Override
    protected void onResume() {
        super.onResume();
        cuentaregresiva.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}