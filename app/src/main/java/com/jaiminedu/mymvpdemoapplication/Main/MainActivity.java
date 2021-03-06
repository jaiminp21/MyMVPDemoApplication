package com.jaiminedu.mymvpdemoapplication.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.jaiminedu.mymvpdemoapplication.Main.MainContract.MvpView;
import com.jaiminedu.mymvpdemoapplication.R;

/*
* Display Main Screen.
* */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);
    }

    // these are MVP view methods.
    @Override
    public void showSingInScreen() {
        Toast.makeText(this, "Taking user to SignIn Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to SignUp Screen", Toast.LENGTH_SHORT).show();
    }
}
