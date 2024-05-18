package com.tesji.proyecto;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText txNumero;
    private TextInputEditText txTitulo;
    private TextInputEditText txAutor;
    private TextInputEditText txEdicion;
    private TextInputEditText txanio;
    private Button btRegistrar;
    private Button btNueva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        setContentView(R.layout.activity_main);
        //Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //return insets;

        txNumero = findViewById(R.id.Numero);
        txTitulo = findViewById(R.id.Title);
        txAutor = findViewById(R.id.Auto);
        txEdicion = findViewById(R.id.Ediciones);
        txanio = findViewById(R.id.anios);

        btRegistrar = findViewById(R.id.Registra);
        btNueva = findViewById(R.id.Nuw);


        btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numer = Integer.parseInt(txNumero.getText().toString());
                String Titulo = txTitulo.getText().toString();
                String autor = txAutor.getText().toString();
                String Edi = txEdicion.getText().toString();
                int ani = Integer.parseInt(txanio.getText().toString());
                Toast.makeText(getApplicationContext(), "Libro Registrado " + Titulo+"\nAutor: "+autor, Toast.LENGTH_LONG).show();


                btNueva.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txanio.setText(null);
                        txEdicion.setText(null);
                        txAutor.setText(null);
                        txNumero.setText(null);
                        txTitulo.setText(null);
                    }

                });
            }
        });
    }
}