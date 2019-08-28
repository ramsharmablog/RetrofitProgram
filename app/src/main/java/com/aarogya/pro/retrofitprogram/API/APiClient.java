package com.aarogya.pro.retrofitprogram.API;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APiClient {
     private static Retrofit retrofit=null;
     public static String URL="";
     public static Retrofit getClient(){
         HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
         interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
         OkHttpClient  okHttpClient=new OkHttpClient.Builder().addInterceptor(interceptor).build();
         retrofit =new Retrofit.Builder().baseUrl("http://freely.businesscloudservices.in/index.php/v1/api/").addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
         return retrofit;
     }

    public static Retrofit getRetrofit(){
        HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient  okHttpClient=new OkHttpClient.Builder().addInterceptor(interceptor).build();
        retrofit =new Retrofit.Builder().baseUrl("http://103.27.235.50:8082/GPS-Vij/asmx/GetAuthenticateUser.asmx/").addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
        return retrofit;
    }
}
