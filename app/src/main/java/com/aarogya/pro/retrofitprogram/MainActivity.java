package com.aarogya.pro.retrofitprogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.aarogya.pro.retrofitprogram.API.APiClient;
import com.aarogya.pro.retrofitprogram.API.ApIInterface;
import com.aarogya.pro.retrofitprogram.Adapter.CustomAdapter;
import com.aarogya.pro.retrofitprogram.Model.Cat;
import com.aarogya.pro.retrofitprogram.Model.Data;
import com.aarogya.pro.retrofitprogram.Model.LoginInfo;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
   ApIInterface apIInterface;
   ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apIInterface= APiClient.getClient().create(ApIInterface.class);
      //  Call<LoginInfo>loginInfoCall=apIInterface.LOGIN_INFO_CALL("1","2");
        Call<String>loginInfoCall=apIInterface.LOGIN_INFO_CALL("1","2");
        loginInfoCall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("Responce",">>>>>>>>>"+response);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("Throwable",">>>>>>>>>"+t);
            }
        });
      /*  Call<List<LoginInfo>>loginInfoCall=apIInterface.LOGIN_INFO_CALL("1","2");
        loginInfoCall.enqueue(new Callback<List<LoginInfo>>() {
            @Override
            public void onResponse(Call<List<LoginInfo>> call, Response<List<LoginInfo>> response) {
                Log.e("Responce",">>>>>>>>>"+response);
            }

            @Override
            public void onFailure(Call<List<LoginInfo>> call, Throwable t) {
                Log.e("Throwable",">>>>>>>>>"+t);
            }
        });*/
      /*  loginInfoCall.enqueue(new Callback<LoginInfo>() {
            @Override
            public void onResponse(Call<LoginInfo> call, Response<LoginInfo> response) {
             Log.e("Responce",">>>>>>>>>"+response);
             response.body().getResponse();
             Main(response.body());
                ;

            }
            @Override
            public void onFailure(Call<LoginInfo> call, Throwable t) {


            }
        });*/

    }

   /* private void Main(LoginInfo response) {
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new CustomAdapter(getApplicationContext(), Collections.singletonList(response)));
    }*/

/*    private void Main(List<Cat> body, Data data) {
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new CustomAdapter(getApplicationContext(),body,data));
    }*/
}
