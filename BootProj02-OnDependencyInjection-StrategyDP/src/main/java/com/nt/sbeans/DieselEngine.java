package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Lazy
public final class DieselEngine implements IEngine
{

	public DieselEngine() {
		System.out.println("DiesialEngine :: 0-Param Contructore()");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine.start() :: Diesel Engine is Started");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop() :: Diesel Engine is Stoped");
		
	}

}
