package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder> {

  ArrayList<FruitModel> list;
  Context context;

  public CustomAdapter(ArrayList<FruitModel> list,Context context) {
      this.list = list;
      this.context = context;
  }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v= LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
       return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
     FruitModel model = list.get(position);
     holder.imageView.setImageResource(model.getImage());
     holder.textView.setText(model.getFrname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img1);
            textView = itemView.findViewById(R.id.tv1);

        }
    }
}
