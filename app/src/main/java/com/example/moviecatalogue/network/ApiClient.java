package com.example.moviecatalogue.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;
    public static final String API_KEY = "967ad60bd20b9b2102526183323e3c3b";
    public static final String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w200/";
    public static final String BACKDROP_BASE_URL = "https://image.tmdb.org/t/p/w780/";


    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
