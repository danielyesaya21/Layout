package com.example.shopleading;

import android.content.Context;
import android.graphics.Paint;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    ArrayList<MainModel> mainModels;


    public MainAdapter(ArrayList<MainModel> mainModels) {
        this.mainModels = mainModels;
    }




    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_itemdua,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
    holder.imageViewRecycle.setImageResource(mainModels.get(position).getLangLogo());
    holder.textView8.setText(mainModels.get(position).getLangSatu());
        holder.textView9.setText(mainModels.get(position).getLangDua());
        holder.textView10.setText(mainModels.get(position).getLangTiga());
        holder.textView11.setText(mainModels.get(position).getLangEmpat());
        holder.textView13.setText(mainModels.get(position).getLangLima());
    }

    @Override
    public int getItemCount() {
        return mainModels.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewRecycle;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView13;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewRecycle = itemView.findViewById(R.id.imageViewRecycle);
            textView8 = itemView.findViewById(R.id.textView8);
            textView9 = itemView.findViewById(R.id.textView9);
            textView10 = itemView.findViewById(R.id.textView10);
            textView11 = itemView.findViewById(R.id.textView11);
            textView13 = itemView.findViewById(R.id.textView13);
            textView13.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        }
    }
}
