package com.example.ridewithme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    private EditText login_EDT_username;
    private EditText login_EDT_password;
    private MaterialButton login_BTN_login;
    private MaterialButton login_BTN_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    private void findViews(){
      login_EDT_username = findViewById(R.id.login_EDT_username);
      login_EDT_password = findViewById(R.id.login_EDT_password);
      login_BTN_login = findViewById(R.id.login_BTN_login);
      login_BTN_register = findViewById(R.id.login_BTN_register);


    }


}