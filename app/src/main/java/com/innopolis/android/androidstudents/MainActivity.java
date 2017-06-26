package com.innopolis.android.androidstudents;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btLogin , btRegistration;
    private EditText etLogin , etPassword;
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

        etLogin = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btLogin:
//               player.start();
                if (!etLogin.getText().toString().equals("") &&
                        !etPassword.getText().toString().equals("")) {
                    intent = new Intent(this, ManagerActivity.class);
                    startActivity(intent);
                    break;
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            R.string.sign_error, Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    break;
                }
            case R.id.btRegistration:
                intent = new Intent(this, RegistrationActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
