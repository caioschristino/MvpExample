package com.example.caios.mvpexample;

import java.util.List;

/**
 * Created by caios on 6/26/16.
 */
public interface FindItemsInteractor {
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}