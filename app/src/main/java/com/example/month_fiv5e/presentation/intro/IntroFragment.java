package com.example.month_fiv5e.presentation.intro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.month_fiv5e.R;

import java.util.Objects;


public class IntroFragment extends Fragment {














    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_intro, container, false);


    }




    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       //TODO:Init views
        int position=getArguments().getInt("keyForPosition");
        switch (position){

            //TODO
        }



        //saveIsShown();










    }











    private  void saveIsShown(){
        SharedPreferences preferences=getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
        preferences.edit().putBoolean("isShown",true).apply();

    }

}
