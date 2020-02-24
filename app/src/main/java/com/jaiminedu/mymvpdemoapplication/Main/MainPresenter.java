package com.jaiminedu.mymvpdemoapplication.Main;

/*
* Responsible for handling actions from View and updating UI as required.
*  */

public class MainPresenter implements MainContract.MvpPresenter {

    private MainContract.MvpView mView;

    MainPresenter (MainContract.MvpView view) {
        mView = view;
    }

}
