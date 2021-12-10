package com.example.entrenamentsexam;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TrainingInfoFragment extends Fragment {
    private int id;
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.training_info_fragment,container,false);
        return rootView;
    }


    @Override
    public void onStart() {
        super.onStart();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setText();
    }

    public void setText() {
        Log.d("aaaaa",String.valueOf(id));
        View view = getView();
        if (view != null) {
            TextView titol = (TextView) view.findViewById(R.id.trainingTitol);
            TextView descripcio = (TextView) view.findViewById(R.id.trainingDescripcio);
            titol.setText(Entrenament.entrenaments[id].getNom());
            descripcio.setText(Entrenament.entrenaments[id].getDescripcio());
        }

    }
}
