package com.sumanto.popularmovies.network;

import com.sumanto.popularmovies.network.model.Movies;
import com.sumanto.popularmovies.network.model.Reviews;
import com.sumanto.popularmovies.network.model.Trailers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Sumanto on 09/07/2017.
 */

public interface MovieDatabaseService {

    @GET("3/movie/{sort_by}")
    Call<Movies> fetchMovies(@Path("sort_by") String sortBy, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/videos")
    Call<Trailers> findTrailersById(@Path("id") long movieId, @Query("api_key") String apiKey);

    @GET("3/movie/{id}/reviews")
    Call<Reviews> findReviewsById(@Path("id") long movieId, @Query("api_key") String apiKey);
}