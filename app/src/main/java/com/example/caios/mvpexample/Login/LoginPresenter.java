package com.example.caios.mvpexample.Login;

/**
 * Created by caios on 6/26/16.
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}