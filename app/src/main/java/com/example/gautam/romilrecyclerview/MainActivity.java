package com.example.gautam.romilrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DogPhotos> dogPhotosList;
    private RecyclerView rv_dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_dog);

        rv_dog = (RecyclerView)findViewById(R.id.rv_dog);

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        );

        rv_dog.setLayoutManager(layoutManager);

        initializeData();
        initialieAdapter();
    }

    public void initializeData(){
        dogPhotosList = new ArrayList<>();
        dogPhotosList.add(new DogPhotos(R.drawable.dog1));
        dogPhotosList.add(new DogPhotos(R.drawable.dog2));
        dogPhotosList.add(new DogPhotos(R.drawable.dog3));
        dogPhotosList.add(new DogPhotos(R.drawable.dog4));
        dogPhotosList.add(new DogPhotos(R.drawable.dog5));
    }

    public void initialieAdapter(){
        RVAdapter_Dog rvAdapter_dog = new RVAdapter_Dog(dogPhotosList);
        rv_dog.setAdapter(rvAdapter_dog);
    }
}
