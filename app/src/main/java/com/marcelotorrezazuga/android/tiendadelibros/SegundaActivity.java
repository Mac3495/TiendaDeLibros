package com.marcelotorrezazuga.android.tiendadelibros;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class SegundaActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{

    Tienda tienda;
    List<Libro> libros;
    ListView a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        libros = new ArrayList<Libro>();
        tienda = new Tienda("",1,null);
        Intent i = getIntent();
        tienda = (Tienda)i.getSerializableExtra("Catalogo");
        a = (ListView) findViewById(R.id.listView);
        b = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<Libro> adaptador = new ArrayAdapter<Libro>(this,android.R.layout.simple_list_item_1,tienda.getListaLibros());
        a.setAdapter(adaptador);
        a.setOnItemClickListener(this);
        b.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.listView){
            libros.add(tienda.getListaLibros().get(position));
        }
        if(parent.getId() == R.id.listView2){
            libros.remove(position);
            Toast.makeText(getApplicationContext(), "Eliminado", Toast.LENGTH_SHORT).show();
        }
        ArrayAdapter<Libro> adaptador = new ArrayAdapter<Libro>(this,android.R.layout.simple_list_item_1,libros);
        b.setAdapter(adaptador);
        EditText t = (EditText) findViewById(R.id.editText6);
        t.setText(sumarprecios()+"");
    }

    public double sumarprecios(){
        double s = 0;
        for(int i=0;i<libros.size();i++){
            s = s+libros.get(i).getPrecio();
        }
        return s;
    }
}
