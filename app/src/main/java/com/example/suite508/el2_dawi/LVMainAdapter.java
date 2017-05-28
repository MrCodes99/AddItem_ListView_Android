package com.example.suite508.el2_dawi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by suite508 on 27/05/2017.
 */

public class LVMainAdapter extends ArrayAdapter<Persona> {
    public LVMainAdapter(Context context) {
        super(context, 0, new ArrayList<Persona>());
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.main_item, parent, false);

        TextView tvMainNombre, tvMainApellido, tvMainTelefono, tvMainDireccion,tvMainEdad;

        tvMainNombre = (TextView) convertView.findViewById(R.id.tvMainNombre);
        tvMainApellido = (TextView) convertView.findViewById(R.id.tvMainApellido);
        tvMainTelefono = (TextView) convertView.findViewById(R.id.tvMainTelefono);
        tvMainDireccion = (TextView) convertView.findViewById(R.id.tvMainDireccion);
        tvMainEdad = (TextView) convertView.findViewById(R.id.tvMainEdad);

        Persona persona = getItem(position);

        tvMainNombre.setText(persona.getNombre());
        tvMainApellido.setText(persona.getApellido());
        tvMainTelefono.setText(persona.getTelefono());
        tvMainDireccion.setText(persona.getDireccion());
        tvMainEdad.setText(persona.getEdad());

        return convertView;
    }
}
