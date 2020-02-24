package com.jaiminedu.mymvpdemoapplication.main;

/*
 * Responsible for handling actions from View and updating UI as required.
 *  */

import android.view.View;

public class MainPresenter implements MainContract.MvpPresenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view) {
        mView = view;
    }

    /// these are MVP presenter methods
    @Override
    public void handleSignInButtonClick(View view) {
        mView.showSingInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mView.showSignUpScreen();
    }
}
