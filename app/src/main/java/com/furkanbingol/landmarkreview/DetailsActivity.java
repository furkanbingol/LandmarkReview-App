package com.furkanbingol.landmarkreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.furkanbingol.landmarkreview.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Landmark selected = (Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selected.name);
        binding.countryText.setText("Country: " + selected.country);
        binding.imageView.setImageResource(selected.image);
    }
}