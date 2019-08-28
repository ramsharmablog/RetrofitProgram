package com.aarogya.pro.retrofitprogram.API;

import com.aarogya.pro.retrofitprogram.Model.LoginInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApIInterface {
    @POST("suggetion")
    //Call<List<LoginInfo>>LOGIN_INFO_CALL(@Query("start")String Uname, @Query("user_id")String Upass);
 //   Call<LoginInfo>LOGIN_INFO_CALL(@Query("start")String Uname, @Query("user_id")String Upass);
    Call<String>LOGIN_INFO_CALL(@Query("start")String Uname, @Query("user_id")String Upass);
}
