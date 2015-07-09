package com.example.roboguice;

import roboguice.inject.ContextSingleton;

import android.util.Log;

import com.google.inject.Inject;
import com.google.inject.name.Named;
@ContextSingleton
public class InjectDemo implements Runnable{
	@Inject
	 public InjectDemo(@Named("width")int width,@Named("name")String name) {
		 Log.e("guocq1","InjectDemo--"+",width:"+width+",name:"+name+"__this:"+this);
	}

	@Override
	public void run() {
		Log.e("guocq1","InjectDemo  run ");
	}
}
