package com.proyecto.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Segunda extends Activity {
	
	TextView texto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
		
		texto = (TextView) findViewById(R.id.textView1);
		
		Bundle bundle = getIntent().getExtras();
		
		if(bundle != null){
			String recibido = bundle.getString("enviar");
			
			texto.setText(recibido);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda, menu);
		return true;
	}

}
