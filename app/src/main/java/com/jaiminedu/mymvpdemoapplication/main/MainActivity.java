package com.jaiminedu.mymvpdemoapplication.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jaiminedu.mymvpdemoapplication.R;
import com.jaiminedu.mymvpdemoapplication.databinding.MainActivityBinding;

/*
 * Display Main Screen.
 * */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main_activity);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        mPresenter = new MainPresenter(this);
        binding.setPresenter(mPresenter);
    }

    // these are MVP view methods.
    @Override
    public void showSingInScreen() {
        Toast.makeText(this, "Taking user to SignIn Screen", Toast.LENGTH_SHORT).show();
        Log.i("click done","Taking user to SignIn Screen");
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to SignUp Screen", Toast.LENGTH_SHORT).show();
        Log.i("click done","Taking user to SignUp Screen");
    }
}
