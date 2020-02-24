package com.jaiminedu.mymvpdemoapplication.Main;


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
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }
}
