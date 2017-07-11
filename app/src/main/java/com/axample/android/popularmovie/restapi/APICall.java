package com.axample.android.popularmovie.restapi;

import com.axample.android.popularmovie.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by imam.munandar on 07/11/17.
 */

public interface APICall {

    @GET("movie/popular?")
    Call<MovieResponse> getPopularMovie(@Query("page") int page);

    @GET("movie/top_rated?")
    Call<MovieResponse> getHighRatedMovie(@Query("page") int page);
}

