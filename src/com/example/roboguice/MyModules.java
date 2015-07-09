package com.example.roboguice;

import java.util.LinkedList;
import java.util.List;

import com.example.roboguice.annotation.PO;
import com.example.roboguice.imp.PhoneStyleOne;
import com.example.roboguice.imp.PhoneStyleTwo;
import com.example.roboguice.service.PhoneService;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class MyModules extends AbstractModule {

	@Override
	protected void configure() {
		
//		bind(PhoneService.class).to(PhoneStyleOne.class);
		
		
//		//���Ӱ󶨣�
//		bind(PhoneService.class).to(PhoneStyleOne.class);
//		bind(PhoneStyleOne.class).to(PhoneStyleTwo.class);
//		bind(PhoneService.class).annotatedWith(PO.class).to(PhoneStyleOne.class);
//		bind(PhoneService.class).annotatedWith(PW.class).to(PhoneStyleTwo.class);
		
//		bind(PhoneService.class).annotatedWith(Names.named("phOne")).to(PhoneStyleOne.class);
//		bind(PhoneService.class).annotatedWith(Names.named("phTwo")).to(PhoneStyleTwo.class);
//		bind(PhoneService.class).to(PhoneStyleOne.class).in(Singleton.class);
		
//		bind(Integer.class).annotatedWith(Names.named("width")).toInstance(10);
//		bind(String.class).annotatedWith(Names.named("name")).toInstance("zhangsan");
//		bind(Runnable.class).to(InjectDemo.class);
		bind(PhoneStyleOne.class).in(Singleton.class);
//		bind(PhoneStyleTwo.class).toProvider(ProviderString.class);
//		bind(new TypeLiteral<List<String>>(){}).toInstance(new ArrayList<String>());
	}
	@Provides @Named("MyPhoneService")
	PhoneService provideMyPhoneService(){
		return new PhoneService() {
			@Override
			public void call() {
				System.out.println(" Providers  PhoneService");
			}
		};
	}
	@Provides @PO
	PhoneService provideMyPhoneService1(){
		return new PhoneService() {
			@Override
			public void call() {
				System.out.println(" Providers  PhoneService  one");
			}
		};
	}
	
	@Provides
	List<String> provideString()
	{
		return new LinkedList<String>();
	}

}
