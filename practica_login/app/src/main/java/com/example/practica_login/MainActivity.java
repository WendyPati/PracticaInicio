package com.example.practica_login;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.security.Principal;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask tarea =new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity. this, usuario.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo =new Timer();
        tiempo.schedule(tarea, 5000);
    }
}