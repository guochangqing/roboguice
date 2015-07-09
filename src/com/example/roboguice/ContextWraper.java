package com.example.roboguice;

import com.google.inject.Inject;

import android.content.Context;

public class ContextWraper {
	private final Context context;
	@Inject
	public ContextWraper(Context context)
	{
		this.context=context;
		System.out.println("context.name:"+context.getClass().getSimpleName());
	}
}
