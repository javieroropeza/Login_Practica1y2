package com.example.p;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void ValidarLogin(View v){
		EditText txtLogin = (EditText)findViewById(R.id.etusu);
		EditText txtClave = (EditText)findViewById(R.id.etpass);
		if(txtLogin.getText().toString().equals("root")&& txtClave.getText().toString().equals("admin")){
			Intent intent = new Intent(this, Listado.class);
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
