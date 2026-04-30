package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")

public final class CNGEngine implements IEngine
{

	public CNGEngine() {
		System.out.println("CNGEngine :: 0 - Param Contructore()");
	}
	@Override
	public void start() {
		System.out.println("CNGEngine.start() :: CNG Engine is Started");
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop() :: CNG Engine is Stoped");
		
	}

}
