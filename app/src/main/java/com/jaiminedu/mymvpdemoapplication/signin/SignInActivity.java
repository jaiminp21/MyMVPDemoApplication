package com.jaiminedu.mymvpdemoapplication.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jaiminedu.mymvpdemoapplication.R;

public class SignInActivity extends AppCompatActivity implements SignInContract.SignInView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);
    }
}
