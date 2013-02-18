package edu.segal.androidbradbox;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;

public class SMSIntentReceiver extends BroadcastReceiver{


	@Override
	public void onReceive(Context c, Intent i) {
		System.out.println("onReceive started");
		String number = "+14252758461";
		String message = "App not working";
		
		Bundle extras = i.getExtras();
		if (extras == null) {
			System.out.println("extras was null");
		} else {
			System.out.println(extras.get("number"));
			System.out.println(extras.get("message"));
			number = extras.get("number").toString();
			message = extras.get("message").toString();
		}
	
		SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(number, null, message, null, null);	
	
	}
	//"+16305369748"

}
