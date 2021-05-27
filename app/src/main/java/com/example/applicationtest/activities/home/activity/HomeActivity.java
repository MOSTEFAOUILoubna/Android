package com.example.applicationtest.activities.home.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.applicationtest.MainActivity;
import com.example.applicationtest.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button clculeGluButton = findViewById(R.id.calculeButton);
        clculeGluButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CalculeGluActivity.class);
                startActivity(intent);
            }
        });



    }
}
/*
*
                FragmentManager fm = getSupportFragmentManager();
                CalculeGluFragment calculGluFragment = CalculeGluFragment.newInstance();
                calculGluFragment.show(fm, calculGluFragment.getClass().getSimpleName());
                * */


                /*Fragment calculGluFragment = new CalculeGluFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, calculGluFragment, calculGluFragment.getClass().getSimpleName())
                        .addToBackStack(null)
                        .commit();*/