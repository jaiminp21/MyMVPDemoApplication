package com.jaiminedu.mymvpdemoapplication.main;


import android.view.View;

/**
 * Defines the contract between the View {@link MainActivity} and
 * the Presenter {@link MainPresenter}
 */

public interface MainContract {

    interface MvpView {
        void showSingInScreen();

        void showSignUpScreen();
    }

    interface MvpPresenter {
        void handleSignInButtonClick(View view);

        void handleSignUpButtonClick(View view);
    }
}
