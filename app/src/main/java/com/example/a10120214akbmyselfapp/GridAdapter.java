package com.example.a10120214akbmyselfapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    List<GridItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<GridItem>();
        GridItem nama = new GridItem();
        nama.setThumbnail(R.drawable.poto1);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto2);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto3);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto4);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto5);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto6);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto7);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto8);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto9);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.poto10);
        mItems.add(nama);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        GridItem nature = mItems.get(i);
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);

        }
    }
}
