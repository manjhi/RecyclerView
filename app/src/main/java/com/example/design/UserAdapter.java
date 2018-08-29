package com.example.design;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{


    List<UserData> userData;
    Context context;

    public UserAdapter(List<UserData> userData, Context context) {
        this.userData = userData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    UserData data=userData.get(position);
    holder.User_name.setText(data.Name);
    holder.User_post.setText(data.Post);
    holder.User_exp.setText(data.Experience);
    holder.User_location.setText(data.Location);
    }

    @Override
    public int getItemCount() {
        return userData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView User_name,User_post,User_exp,User_location;
//        ImageView User_image;
        public MyViewHolder(View itemView) {
            super(itemView);

            User_name=(TextView)itemView.findViewById(R.id.name);
            User_post=(TextView)itemView.findViewById(R.id.Post);
            User_exp=(TextView)itemView.findViewById(R.id.experience);
            User_location=(TextView)itemView.findViewById(R.id.location);
//            User_image=(ImageView)itemView.findViewById(R.id.image);
        }
    }
}
