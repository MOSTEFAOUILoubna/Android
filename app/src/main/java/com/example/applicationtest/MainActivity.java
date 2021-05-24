package com.example.applicationtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewModel viewModel;

    Spinner sp_categories , sp_aliments;
    ArrayList<String> arrayList_categories;
    ArrayAdapter<String> arrayAdapter_categories;

    ArrayList<String> arrayList_Legumes , arrayList_Fruits ,arrayList_Pain ;
    ArrayAdapter<String> arrayAdapter_aliments;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_categories=(Spinner)findViewById(R.id.sp_categories);
        sp_aliments=(Spinner)findViewById(R.id.sp_aliments);
        arrayList_categories=new ArrayList<>();
        arrayList_categories.add("Legumes");
        arrayList_categories.add("Fruits");
        arrayList_categories.add("Pain");

        arrayAdapter_categories=new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1,arrayList_categories);
        sp_categories.setAdapter(arrayAdapter_categories);

        //Aliments spinner prosses start

        //Liste Legumes
        arrayList_Legumes=new ArrayList<>();
        arrayList_Legumes.add("Bettrave");
        arrayList_Legumes.add("Carotte");
        arrayList_Legumes.add("Chou");
        arrayList_Legumes.add("Onion rouge");

    // Liste Fruits
        arrayList_Fruits=new ArrayList<>();
        arrayList_Fruits.add("Abricot");
        arrayList_Fruits.add("Ananas");
        arrayList_Fruits.add("Fraise");


    // Liste Pain
        arrayList_Pain=new ArrayList<>();
        arrayList_Pain.add("Baguette");
        arrayList_Pain.add("Beignet");
        arrayList_Pain.add("Brioche");

        sp_categories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    arrayAdapter_aliments=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList_Legumes);
                }
                if(position==1){
                    arrayAdapter_aliments=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList_Fruits);
                }
                if(position==2){
                    arrayAdapter_aliments=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList_Pain);
                }


                sp_aliments.setAdapter(arrayAdapter_aliments);

            }
        });



















        //Aliments spinner prosses end






    }
}

