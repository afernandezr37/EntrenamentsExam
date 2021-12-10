package com.example.entrenamentsexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class TrainingInfoActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcio_entrenament);
        Intent mIntent = getIntent();
        long idLong = mIntent.getIntExtra("id", 0);
        int id = Math.round(idLong);
        FragmentManager fm = getSupportFragmentManager();
        TrainingInfoFragment fragment =  (TrainingInfoFragment) fm.findFragmentById(R.id.fragmentDescrpico);
        fragment.setId(id);
        fragment.setText();
    }

}
