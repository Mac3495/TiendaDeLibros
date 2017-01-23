package com.marcelotorrezazuga.android.tiendadelibros;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    Tienda tienda;
    ArrayList<Libro> li = new ArrayList<Libro>();
    EditText a,b,c;
    Button x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tienda = new Tienda("LibrosAqui",77744736,li);

        a = (EditText) findViewById(R.id.editText);
        b = (EditText) findViewById(R.id.editText2);
        c = (EditText) findViewById(R.id.editText3);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/
        switch (item.getItemId()){
            case R.id.acercaDe:
                Intent i = new Intent(this,TerceraActivity.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    public void agregar(View v){
         String titulo, codigo,precioo;
         double precio;
         titulo = a.getText().toString();
         codigo = b.getText().toString();
         precioo = c.getText().toString();

         if(titulo.matches("")||codigo.matches("")||precioo.matches("")){
             Toast.makeText(getApplicationContext(),"Ingrese los datos",Toast.LENGTH_SHORT).show();
         }
         else {
             precio = Integer.parseInt(c.getText().toString());
             Libro libro = new Libro(titulo, codigo, precio);
             Toast.makeText(getApplicationContext(), "Agregado al carrito", Toast.LENGTH_SHORT).show();
             tienda.getListaLibros().add(libro);
             a.setText("");
             b.setText("");
             c.setText("");
         }
    }

    public void catalogo(View v){
        Intent i = new Intent(this,SegundaActivity.class);
        i.putExtra("Catalogo",tienda);
        startActivity(i);
    }

    public void salir(View v){
        Intent i = new Intent();
        finish();
    }
}
