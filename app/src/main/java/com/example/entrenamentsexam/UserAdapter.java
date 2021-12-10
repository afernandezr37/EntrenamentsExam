package com.example.entrenamentsexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<Entrenament> {

    public UserAdapter(Context context, ArrayList<Entrenament> users) {

        super(context, 0, users);

    }



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position

        Entrenament user = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.entrenaments, parent, false);

        }

        // Lookup view for data population

        TextView tvName = (TextView) convertView.findViewById(R.id.entrenamentNom);


        // Populate the data into the template view using the data object

        tvName.setText(user.getNom());


        // Return the completed view to render on screen

        return convertView;

    }

}