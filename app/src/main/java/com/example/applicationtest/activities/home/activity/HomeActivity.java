package com.example.applicationtest.activities.home.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.applicationtest.R;
import com.example.applicationtest.activities.home.activity.fragments.CalculeGluFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button startButton = findViewById(R.id.calculeButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // startButton.setVisibility(View.INVISIBLE);
                Fragment calculGluFragment = new CalculeGluFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, calculGluFragment, calculGluFragment.getClass().getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });



    }
}
