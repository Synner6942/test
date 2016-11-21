package com.example.lenovo.proyectov110;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Frutas extends AppCompatActivity {

    ListView lista;
    String[] personas = {
            "Arándano",
            "Caqui",
            "Cereza",
            "Ciruela",
            "Coco",
            "Frambuesa",
            "Fresa",
            "Granada",
            "Higo",
            "Kiwi",
            "Lima",
            "Limón",
            "Mandarina",
            "Mango",
            "Manzana",
            "Melón",
            "Membrillo",
            "Moras",
            "Naranja",
            "Nispero"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista = (ListView) findViewById(R.id.listView1);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, personas);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "posicion " + (i+1) + personas[i], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
