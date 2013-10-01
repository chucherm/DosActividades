package com.proyecto.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HolaMundo extends Activity implements OnClickListener{
	
	Button enviar;
	EditText datos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hola_mundo);
		
		enviar = (Button) findViewById(R.id.enviar);
		enviar.setOnClickListener(this);
		
		datos = (EditText) findViewById(R.id.texto);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hola_mundo, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Hola como estas", Toast.LENGTH_LONG).show();
		
		String datos_envio = datos.getText().toString();
		
		Intent inte = new Intent(this, Segunda.class);
		inte.putExtra("enviar", datos_envio);
		startActivity(inte);
	}

}
