package com.jaiminedu.mymvpdemoapplication.SignIn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jaiminedu.mymvpdemoapplication.R;

public class SignInActivity extends AppCompatActivity implements SignInContract.SignInView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}
