package com.aarogya.pro.retrofitprogram.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aarogya.pro.retrofitprogram.Model.Cat;
import com.aarogya.pro.retrofitprogram.Model.Data;
import com.aarogya.pro.retrofitprogram.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapternew extends RecyclerView.Adapter<CustomAdapternew.MyHandler> {
Context context;
List<String>loginInfos=new ArrayList<String>();
    public CustomAdapternew(Context context, List<String>loginInfosss){
        this.context=context;
        this.loginInfos=loginInfosss;
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
    public CustomAdapternew.MyHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHandler(LayoutInflater.from(context).inflate(R.layout.activity_main_screen,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull CustomAdapternew.MyHandler holder, int position) {

//         holder.textViewname.setText(info.get());
//       holder.textViewcatid.setText(info.getName());

    }


    @Override
    public int getItemCount() {
        return loginInfos.size();
    }


}
