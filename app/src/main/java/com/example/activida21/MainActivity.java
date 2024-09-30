package com.example.activida21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void obtenerTexto(View view){
        EditText nombreFoto = (EditText) findViewById(R.id.textInputEditText);
        String nombreFotoST = nombreFoto.getText().toString();

        Intent sIntent = new Intent(this, MainActivity2.class);
        sIntent.putExtra("STNombre", nombreFotoST);
        startActivity(sIntent);
    }
}