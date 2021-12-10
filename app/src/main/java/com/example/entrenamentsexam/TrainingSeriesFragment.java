package com.example.entrenamentsexam;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainingSeriesFragment extends ListFragment {
    public static interface Listener {
        public void itemClicked(Long id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.training_series_fragment,container,false);

        ArrayList<Entrenament> arrayOfEntrenaments = new ArrayList<Entrenament>(Arrays.asList(Entrenament.entrenaments));

        UserAdapter adaptador = new UserAdapter(this.getContext(), arrayOfEntrenaments);
        setListAdapter(adaptador);
        return rootView;

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            Intent intent = new Intent(getActivity(), TrainingInfoActivity.class);
            intent.putExtra("id", id);
            startActivity(intent);
        }
        else {
            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                FragmentManager fm = getActivity().getSupportFragmentManager();
                TrainingInfoFragment fragment =  (TrainingInfoFragment) fm.findFragmentById(R.id.fragmentDescrpico);
                int intId = Math.round(id);
                fragment.setId(intId);
                fragment.setText();
            }
        }

    }

}
