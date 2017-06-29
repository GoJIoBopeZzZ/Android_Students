package com.innopolis.android.androidstudents.Activities;

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

import com.innopolis.android.androidstudents.R;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{
    Button btSignIn;
    private MediaPlayer player;
    EditText etEmail , etLogin, etPassword, etConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        btSignIn = (Button) findViewById(R.id.btSignIn);
        btSignIn.setOnClickListener(this);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etLogin = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
    }

    @Override
    public void onClick(View view) {
        if (etEmail.getText().toString().equals("") ||
                etLogin.getText().toString().equals("") ||
                etPassword.getText().toString().equals("") ||
                etConfirmPassword.getText().toString().equals(""))
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    R.string.sign_error, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btSignIn:
//                player.start();
                    intent = new Intent(this, ManagerActivity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    }
}
