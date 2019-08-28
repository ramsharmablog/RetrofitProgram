package com.aarogya.pro.retrofitprogram.Adapter;

import android.content.Context;
import android.telecom.Call;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aarogya.pro.retrofitprogram.Model.Cat;
import com.aarogya.pro.retrofitprogram.Model.Data;
import com.aarogya.pro.retrofitprogram.Model.LoginInfo;
import com.aarogya.pro.retrofitprogram.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyHandler> {
Context context;
 List<LoginInfo>loginInfos=new ArrayList<>();
 List<Cat>cats=new ArrayList<>();
//LoginInfo data;
    public CustomAdapter(Context context,List<LoginInfo>loginInfosx){
        this.context=context;
        this.loginInfos=loginInfosx;
       // this.data=data1;
    }
    public class MyHandler extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewname,textViewcatid,textViewdec,textViewmodredec;
        public MyHandler(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);
            textViewcatid=(TextView)itemView.findViewById(R.id.catID);
            textViewname=(TextView)itemView.findViewById(R.id.name);
            textViewdec=(TextView)itemView.findViewById(R.id.namedec);
            textViewmodredec=(TextView)itemView.findViewById(R.id.namemoredec);
        }
    }
    @Override
    public CustomAdapter.MyHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHandler(LayoutInflater.from(context).inflate(R.layout.activity_main_screen,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyHandler holder, int position) {
        LoginInfo info=loginInfos.get(position);
      //  holder.textViewcatid.setText(info.getResponse().getCat().);
        Log.e(">>>>>>>>>>>>>>",""+info.getResponse());
        cats.get(position).getName();
      //  holder.textViewname.setText(info.getResponse().getData().getSports().get(position).getUserFullname());


    }
    @Override
    public int getItemCount() {
        return loginInfos.size();
    }


}
