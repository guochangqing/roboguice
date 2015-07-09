package com.example.roboguice;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.roboguice.imp.PhoneStyleOne;
import com.example.roboguice.service.PhoneService;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class RoboDemoActivity extends RoboActivity {
//	@Inject @Named("gcq") InjectDemo demo;
//	@Inject
//	Runnable runnable;
//	@InjectView(R.id.tv_robo_lable) TextView t;
//	@InjectResource(R.string.app_name) String myName;
//	@InjectResource(R.drawable.ic_launcher) Drawable icon;
//	@InjectView(R.id.img_robo_inject) ImageView testImg;
//	
//	@Inject ContentResolver contentResolver;
//	@Inject AssetManager assetManager;
//	@Inject Resources resources;
//	@Inject LocationManager locationManager;
//	@Inject WindowManager windowManager;
//	@Inject LayoutInflater layoutInflater;
//	@Inject ActivityManager activityManager;
//	@Inject PowerManager powerManager;
//	@Inject AlarmManager alarmManager;
//	@Inject NotificationManager notificationManager;
//	@Inject KeyguardManager keyguardManager;
//	@Inject SearchManager searchManager;
//	@Inject Vibrator vibrator;
//	@Inject ConnectivityManager connectivityManager;
//	@Inject WifiManager wifiManager;
//	@Inject InputMethodManager inputMethodManager;
//	@Inject SensorManager sensorManager;
//	@Inject Application application;
////	@Inject PhoneService phoneService;
////	@Inject @PO PhoneService ps1;
////	@Inject @PW PhoneService ps2;
	@Inject PhoneStyleOne ps1;
	@Inject PhoneStyleOne ps2;
//	@Inject @Named("phTwo") PhoneService psTemp;
////	@Inject @Named("phTwo") PhoneService ps2;
//	@Inject Context context;
//	@Inject @Named("MyPhoneService") PhoneService myService;
//	@Inject @PO PhoneService ms1;
//	@Inject PhoneStyleTwo two;
//	@Inject List<String> list;
//	@Inject ContextWraper wraper;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_robo);
//		ps1.call();
		Log.e("guocq1", "ps1::"+ps1);
		Log.e("guocq1", "ps2::"+ps2);
//		System.out.println(list.getClass().getSimpleName());
//		myService.call();
//		ms1.call();
//		two.call();
//		isNull(context);
//		String s=t.getText().toString();
//		v(s);
//		v(myName);
//		testImg.setImageDrawable(icon);
//		vNull();
//		runnable.run();
	}
	void v(Object o){
		System.out.println("o:"+o.toString());
	}
	void vNull(){
//		isNull(contentResolver);
//		isNull(sensorManager);
//		isNull(inputMethodManager);
//		isNull(wifiManager);
//		isNull(connectivityManager);
//		isNull(vibrator);
//		isNull(searchManager);
//		isNull(keyguardManager);
//		isNull(notificationManager);
//		isNull(alarmManager);
//		isNull(powerManager);
//		isNull(layoutInflater);
//		isNull(windowManager);
//		isNull(resources);
//		isNull(assetManager);
//		isNull(application);
	}
	void isNull(Object o)
	{
		System.out.println("0==null:"+(o==null));
	}
    
}
