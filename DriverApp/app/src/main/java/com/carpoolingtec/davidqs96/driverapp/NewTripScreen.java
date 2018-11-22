package com.carpoolingtec.davidqs96.driverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewTripScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.carpoolingtec.davidqs96.driverapp.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.carpoolingtec.davidqs96.driverapp.MESSAGE2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip_screen);
    }

    public void cancelTrip(View view) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    public void startTrip(View view) {

        Intent intent = new Intent(this, StartTrip.class);

        EditText txtSalida = findViewById(R.id.txtSalida);
        String ptoSalida = txtSalida.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, ptoSalida);

        EditText txtDestino = findViewById(R.id.txtDestino);
        String ptoDestino = txtDestino.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, ptoDestino);

        startActivity(intent);
    }


}
