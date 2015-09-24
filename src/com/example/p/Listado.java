package com.example.p;

import java.util.*;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Listado extends Activity{
	
	ListView lista;
	ArrayAdapter<String> adaptador;
	ArrayList<String> datos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lisado);
		
		datos = new ArrayList<String>();
		llenarLista();
		lista = (ListView) findViewById(R.id.listaSimple);
		adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
		lista.setAdapter(adaptador);
		lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View vista, int posicion, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplication(), ""+ (String) ((TextView)vista).getText(),Toast.LENGTH_LONG).show();
			}
		});
	}
	
	private void llenarLista(){
		datos.add("Bienvenid@");
		
		
	}
}
