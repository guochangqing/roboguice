package com.example.roboguice;

import java.util.ArrayList;
import java.util.List;

import roboguice.RoboGuice;
import roboguice.activity.RoboAccountAuthenticatorActivity;

import android.app.Application;
import android.util.Log;

import com.google.inject.Module;
import com.google.inject.util.Modules;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Log.e("guocq1"," my application created ");
		
		ArrayList<Module> modules=new ArrayList<Module>();
		applicationModules(modules);
		
		RoboGuice.setBaseApplicationInjector( 
				this,
				RoboGuice.DEFAULT_STAGE, 
				Modules.override(RoboGuice.newDefaultRoboModule(this)).with(modules)
		);
	}
	public void applicationModules(List<Module> modules){
		
	}
	
}
