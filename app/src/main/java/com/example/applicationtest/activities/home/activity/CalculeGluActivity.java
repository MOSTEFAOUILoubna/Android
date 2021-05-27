package com.example.applicationtest.activities.home.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.example.applicationtest.R;
import com.example.applicationtest.activities.home.activity.fragments.AddAlimentFragment;

public class CalculeGluActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcule_glu);

        ImageView addAlimentToPlat = findViewById(R.id.addAlimentToPlat);
        addAlimentToPlat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("CalculeGluActivity", "onClick: working kho ");
                DialogFragment addAlimentFragment = AddAlimentFragment.newInstance();
                addAlimentFragment.show(getSupportFragmentManager().beginTransaction(),"add Aliment popup ");
            }
        });



    }
}