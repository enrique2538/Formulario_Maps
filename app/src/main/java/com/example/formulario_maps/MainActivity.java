package com.example.formulario_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.botonbuscar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Procesado xd", Toast.LENGTH_LONG).show();
                EditText latitudorigen = findViewById(R.id.latitudorigen);
                EditText longitudorigen = findViewById(R.id.longitudorigen);
                EditText latituddestino = findViewById(R.id.latituddestino);
                EditText longituddestino = findViewById(R.id.longituddestino);

                String latorigen = latitudorigen.getText().toString();
                String longorigen = longitudorigen.getText().toString();
                String latdestino = latituddestino.getText().toString();
                String longdestino = longituddestino.getText().toString();

                //Intent i = new Intent(MainActivity.this, MapsActivity.class);
                //i.putExtra("latorigen", latorigen);
                //i.putExtra("longorigen", longorigen);
                //i.putExtra("latdestino", latdestino);
                //i.putExtra("longdestino", longdestino);
                //startActivity(i);

                Intent button = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(button);

            }
        });






    }
}