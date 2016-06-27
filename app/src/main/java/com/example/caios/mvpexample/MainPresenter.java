package com.example.caios.mvpexample;

/**
 * Created by caios on 6/26/16.
 */
public interface MainPresenter {
    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}