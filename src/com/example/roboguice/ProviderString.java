package com.example.roboguice;

import com.example.roboguice.imp.PhoneStyleTwo;
import com.google.inject.Provider;

public class ProviderString implements Provider<PhoneStyleTwo> {

	@Override
	public PhoneStyleTwo get() {
		System.out.println("get PhoneStyleTwo");
		return new PhoneStyleTwo();
	}

}
