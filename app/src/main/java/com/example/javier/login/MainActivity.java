package com.example.javier.login;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.boton1);
        boton.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                        String usuario = ((EditText)findViewById(R.id.etusu)).getText().toString();
                                         String password = ((EditText)findViewById(R.id.etpass)).getText().toString();
                                         if(usuario.equals("root")&& password.equals("admin")){
                                            Intent nuevoform = new Intent(MainActivity.this,Segunda.class);
                                             startActivity(nuevoform);
                                         }
                                         else{
                                             Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                                         }
                                     }
                                 }


        );{

        }
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ValidarLogin(View v){
        EditText txtLogin = (EditText)findViewById(R.id.etusu);
        EditText txtClave = (EditText)findViewById(R.id.etpass);
        if(txtLogin.getText().toString().equals("root")&& txtClave.getText().toString().equals("admin")){
            Intent intent = new Intent();
            //intent.putExtra("resultado",txtLogin.getText().toString());
            startActivity(intent);
            Toast.makeText(getBaseContext(), "Bienvenid@", Toast.LENGTH_SHORT).show();
        }else{
            LoginIncorrecto();
        }
    }

    public void LoginIncorrecto(){
        Toast.makeText(getBaseContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
    }
}
