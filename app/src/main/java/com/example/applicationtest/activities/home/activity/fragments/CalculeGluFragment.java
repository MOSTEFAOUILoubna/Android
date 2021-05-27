package com.example.applicationtest.activities.home.activity.fragments;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applicationtest.R;

public class CalculeGluFragment extends Fragment {


    public CalculeGluFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CalculeGluFragment newInstance() {
        CalculeGluFragment fragment = new CalculeGluFragment();
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
        return inflater.inflate(R.layout.fragment_calcule_glu, container, false);
    }
}