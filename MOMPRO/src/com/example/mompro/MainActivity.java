package com.example.mompro;

import java.security.PublicKey;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	
	private Button btnGo;
	private RadioButton radioMother;
	private RadioButton radioDoctor;
	private RadioButton radioNurse;
	private RadioGroup group;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonDisplay();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void buttonDisplay(){
		group.addView(radioDoctor);
		group.addView(radioMother);
		group.addView(radioNurse);
		radioDoctor=(RadioButton)findViewById(R.id.radioDoctor);
		radioMother=(RadioButton)findViewById(R.id.redioMother);
		radioNurse=(RadioButton)findViewById(R.id.radioNurse);
		btnGo=(Button)findViewById(R.id.btnGo);
		
		if(radioMother.isChecked()){
			setContentView(R.layout.login_mother);
		}else if(radioDoctor.isChecked()){
			
		}
		

	}
	
	

}
