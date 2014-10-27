package com.example.moji;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	private Vibrator vibrator;
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		String msg = arg1.getStringExtra("msg");
		Toast.makeText(arg0, msg, Toast.LENGTH_LONG).show();
		vibrator = (Vibrator)arg0.getSystemService(Service.VIBRATOR_SERVICE);
		vibrator.vibrate(2000);
	}

}
