package com.jaiminedu.mymvpdemoapplication.Main;

/*
* Responsible for handling actions from View and updating UI as required.
*  */

public class MainPresenter implements MainContract.MvpPresenter {

    private MainContract.MvpView mView;

    MainPresenter (MainContract.MvpView view) {
        mView = view;
    }

    /// these are MVP presenter methods
    @Override
    public void handleSignInButtonClick() {
        mView.showSingInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mView.showSignUpScreen();
    }
}
