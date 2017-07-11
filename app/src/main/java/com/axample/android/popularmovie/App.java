package com.axample.android.popularmovie;

import android.app.Application;

import com.axample.android.popularmovie.restapi.RestClient;

/**
 * Created by imam.munandar on 07/11/17.
 */

public class App extends Application {

    private static RestClient restClient;

    @Override
    public void onCreate() {
        super.onCreate();

        restClient = new RestClient();
    }

    public static RestClient getRestClient(){
        return restClient;
    }
}

