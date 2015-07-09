package com.example.roboguice.imp;

import android.util.Log;

import com.example.roboguice.service.PhoneService;

public class PhoneStyleOne implements PhoneService {
	public PhoneStyleOne() {
		Log.e("guocq1","PhoneStyleOne");
	}

	@Override
	public void call() {
		Log.e("guocq1","PhoneStyleOne:PhoneStyleOne");
	}

}
