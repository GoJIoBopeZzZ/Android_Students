package com.innopolis.android.androidstudents;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btLogin;
    private Button btRegistration;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        player = MediaPlayer.create(getApplicationContext(), R.raw.sound);

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.login);

        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);

        btRegistration = (Button) findViewById(R.id.btRegistration);
        btRegistration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btLogin:
                player.start();
                intent = new Intent(this , ManagerActivity.class);
                startActivity(intent);
                break;
            case R.id.btRegistration:
                intent = new Intent(this , RegistrationActivity.class);
                startActivity(intent);
                break;
            default: break;
        }
    }
}
