package com.example.gautam.romilrecyclerview;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Gautam on 02-Apr-17.
 */

public class RVAdapter_Dog extends RecyclerView.Adapter<RVAdapter_Dog.DogsViewHolder> {

    List<DogPhotos> dogPhotosList;

    RVAdapter_Dog(List<DogPhotos> dogPhotosList){
        this.dogPhotosList = dogPhotosList;
    }

    @Override
    public RVAdapter_Dog.DogsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);
        DogsViewHolder dvh = new DogsViewHolder(v);
        return dvh;
    }

    @Override
    public void onBindViewHolder(RVAdapter_Dog.DogsViewHolder holder, int position) {
        holder.dogPhotoView.setImageResource(dogPhotosList.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return dogPhotosList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class DogsViewHolder extends RecyclerView.ViewHolder {
        ImageView dogPhotoView;
        public DogsViewHolder(View itemView) {
            super(itemView);
            dogPhotoView = (ImageView)itemView.findViewById(R.id.dog_photo);
        }
    }
}
