package com.example.applicationtest.activities.home.activity.fragments;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applicationtest.R;

public class AddAlimentFragment extends DialogFragment {


    public AddAlimentFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static AddAlimentFragment newInstance() {
        AddAlimentFragment fragment = new AddAlimentFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.diag_add_aliments, container, false);
    }
}