package com.furkanbingol.landmarkreview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.furkanbingol.landmarkreview.databinding.ActivityDetailsBinding;
import com.furkanbingol.landmarkreview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkList = new ArrayList<>();

        //Data
        Landmark pisa = new Landmark("Pisa Tower", "Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel Tower", "France", R.drawable.eiffel);
        Landmark colosseum = new Landmark("Colosseum", "Italy", R.drawable.colosseum);
        Landmark galatatower = new Landmark("Galata Tower", "Turkey", R.drawable.galatatower);
        Landmark hagiasophia = new Landmark("Hagia Sophia", "Turkey", R.drawable.hagiasophia);
        Landmark londonbridge = new Landmark("London Bridge", "UK", R.drawable.londonbridge);
        Landmark tajmahal = new Landmark("Taj Mahal", "India", R.drawable.tajmahal);

        landmarkList.add(pisa);
        landmarkList.add(eiffel);
        landmarkList.add(colosseum);
        landmarkList.add(galatatower);
        landmarkList.add(hagiasophia);
        landmarkList.add(londonbridge);
        landmarkList.add(tajmahal);

        //Adapter

        /*
          //ListView (daha verimsiz)
            //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, landmarkList.get(i).country, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark", landmarkList.get(i));
                startActivity(intent);
            }
        });
        */

           //RecyclerView  (DAHA VERİMLİ)
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}