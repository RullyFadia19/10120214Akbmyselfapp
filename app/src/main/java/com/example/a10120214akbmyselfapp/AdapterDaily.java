package com.example.a10120214akbmyselfapp;
//NIM : 10120214 Nama : Rully fadia Kelas: IF-6
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterDaily extends RecyclerView.Adapter<AdapterDaily.myviewholder> {

        ArrayList<DailyModel> dailyModel;

        public AdapterDaily(ArrayList<DailyModel> dailyModel) {
            this.dailyModel = dailyModel;
        }

        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new myviewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull myviewholder holder, int position) {
            holder.logoDaily.setImageResource(dailyModel.get(position).getImage());
            holder.titleDaily.setText(dailyModel.get(position).getTitle());
            holder.descDaily.setText(dailyModel.get(position).getDesc());
        }

        @Override
        public int getItemCount() {
            return dailyModel.size();
        }

        class myviewholder extends RecyclerView.ViewHolder {
            ImageView logoDaily;
            TextView titleDaily, descDaily;

            public myviewholder(@NonNull View itemView) {
                super(itemView);
                logoDaily = itemView.findViewById(R.id.imageList);
                titleDaily = itemView.findViewById(R.id.text_headline);
                descDaily = itemView.findViewById(R.id.text_subhead);
            }
        }
    }