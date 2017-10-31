package com.freestyle.www.wsdk.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by yuxumou on 17-10-31.
 */

public class ApiWarpper {

    public static final String BASE_URL = "";
    public static final long TIME_OUT = 5000l;

    public ApiWarpper() {

        //建立Retrofit
        Retrofit retrofit = buildRetrofit();

        ApiService apiService = retrofit.create(ApiService.class);

    }


    private Retrofit buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(buildClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    private OkHttpClient buildClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
                .readTimeout(TIME_OUT, TimeUnit.MILLISECONDS)
                .build();
    }

}
