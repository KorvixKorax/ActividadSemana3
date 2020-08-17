package com.example.mascotas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<perfiles> perfiles;
    private RecyclerView listaperfiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaperfiles = findViewById(R.id.rvPerfiles);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaperfiles.setLayoutManager(llm);
        inicializarlista();
        inicializaradaptador();

    }

    public void inicializaradaptador () {
        perfiladaptador adaptador = new perfiladaptador(perfiles);
        listaperfiles.setAdapter(adaptador);
    }

    public void inicializarlista () {

        perfiles = new ArrayList<perfiles>();

        perfiles.add(new perfiles(R.drawable.paw_print_512, "Doggo"));
        perfiles.add(new perfiles(R.drawable.paw_print_512, "Lucky"));
        perfiles.add(new perfiles(R.drawable.paw_print_512, "Queso"));
        perfiles.add(new perfiles(R.drawable.paw_print_512, "Michi"));
        perfiles.add(new perfiles(R.drawable.paw_print_512, "Lex"));

    }

    }