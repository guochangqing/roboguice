package com.example.roboguice;

import java.util.ArrayList;
import java.util.List;

import roboguice.RoboGuice;
import roboguice.activity.RoboAccountAuthenticatorActivity;

import android.app.Application;

import com.google.inject.Module;
import com.google.inject.util.Modules;

public class MyApplicationDemo extends MyApplication {
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println(" my application created ");
		
		ArrayList<Module> modules=new ArrayList<Module>();
		applicationModules(modules);
		
		RoboGuice.setBaseApplicationInjector( 
				this,
				RoboGuice.DEFAULT_STAGE, 
				Modules.override(RoboGuice.newDefaultRoboModule(this)).with(modules)
		);
	}
	@Override
	public void applicationModules(List<Module> modules) {
		super.applicationModules(modules);
		modules.add(new MyModules());
	}
	
}
