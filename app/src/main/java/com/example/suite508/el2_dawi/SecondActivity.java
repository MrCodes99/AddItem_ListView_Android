package com.example.suite508.el2_dawi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by suite508 on 27/05/2017.
 */

public class SecondActivity extends AppCompatActivity {

    private EditText etNombre, etApellido, etTelefono, etDireccion, etEdad;
    private Button btActualizar, btRegistrar;

    private final View.OnClickListener btRegistrarOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();

            /*
            String name = etNombre.getText().toString();
            String ape = etNombre.getText().toString();
            String fono = etNombre.getText().toString();
            String dir = etNombre.getText().toString();
            String edad = etNombre.getText().toString();*/

            String name = etNombre.getText().toString();
            String ape = etApellido.getText().toString();
            String fono = etTelefono.getText().toString();
            String dir = etDireccion.getText().toString();
            String edad = etEdad.getText().toString();


            if (TextUtils.isEmpty(name)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("nombre", etNombre.getText().toString());
            }

            if (TextUtils.isEmpty(ape)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("apellido", etApellido.getText().toString());
            }

            if (TextUtils.isEmpty(fono)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("telefono", etTelefono.getText().toString());
            }

            if (TextUtils.isEmpty(dir)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("direccion", etDireccion.getText().toString());
            }

            if (TextUtils.isEmpty(edad)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("edad", etEdad.getText().toString());
            }

/*
            intent.putExtra("nombre", etNombre.getText().toString());
            intent.putExtra("apellido", etApellido.getText().toString());
            intent.putExtra("telefono", etTelefono.getText().toString());
            intent.putExtra("direccion", etDireccion.getText().toString());
            intent.putExtra("edad", etEdad.getText().toString());
*/

            setResult(RESULT_OK, intent);
            finish();
        }
    };

    private final View.OnClickListener btActualizarOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            String name = etNombre.getText().toString();
            String ape = etApellido.getText().toString();
            String fono = etTelefono.getText().toString();
            String dir = etDireccion.getText().toString();
            String edad = etEdad.getText().toString();


            if (TextUtils.isEmpty(name)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("nombre", etNombre.getText().toString());
            }

            if (TextUtils.isEmpty(ape)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("apellido", etApellido.getText().toString());
            }

            if (TextUtils.isEmpty(fono)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("telefono", etTelefono.getText().toString());
            }

            if (TextUtils.isEmpty(dir)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("direccion", etDireccion.getText().toString());
            }

            if (TextUtils.isEmpty(edad)) {
                Toast.makeText(SecondActivity.this, "Ha dejado campos vacios", Toast.LENGTH_LONG).show();
                return;
            }
            else {
                intent.putExtra("edad", etEdad.getText().toString());
            }
            /*
            String name = etNombre.getText().toString();
            String ape = etNombre.getText().toString();
            String fono = etNombre.getText().toString();
            String dir = etNombre.getText().toString();
            String edad = etNombre.getText().toString();*/


            setResult(RESULT_OK, intent);
            finish();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellido = (EditText) findViewById(R.id.etApellido);
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etDireccion = (EditText) findViewById(R.id.etDireccion);
        etEdad = (EditText) findViewById(R.id.etEdad);

        btRegistrar = (Button) findViewById(R.id.btRegistrar);
        btActualizar = (Button) findViewById(R.id.btActualizar);

        btRegistrar.setOnClickListener(btRegistrarOnClickListener);
        btActualizar.setOnClickListener(btActualizarOnClickListener);

        Intent intent = getIntent();

        etNombre.setText(intent.getStringExtra("nombre"));
        etApellido.setText(intent.getStringExtra("apellido"));
        etTelefono.setText(intent.getStringExtra("telefono"));
        etDireccion.setText(intent.getStringExtra("direccion"));
        etEdad.setText(intent.getStringExtra("edad"));

    }
}
