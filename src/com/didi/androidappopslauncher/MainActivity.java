package com.didi.androidappopslauncher;

import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		boolean bActivityNotFound = false;
		Intent intent = new Intent();
		
		try {
			intent.setAction("android.settings.APP_OPS_SETTINGS");
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			bActivityNotFound = true;
		} 
		
		finally {
			if (bActivityNotFound) {
				Toast.makeText(getApplicationContext(), "Ops Activity is Not Found!!", 
								Toast.LENGTH_SHORT).show();
			}
			finish();
		}
	}
}
