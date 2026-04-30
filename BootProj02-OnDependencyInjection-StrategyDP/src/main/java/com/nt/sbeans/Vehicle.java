package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
// HAS A properties for FeildEngine
	
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public Vehicle() {
	System.out.println("Vehicle :: 0 - Param - Contructore");
	}
	
	public void journey(String startPlace, String endPlace)
	{
		System.out.println("Vehicle.Journey()");
		//start the engine to start journy
		engine.start();
		System.out.println("Vehicle.journey start From  :: " +startPlace);
		
		System.out.println("Vehicle.journey() journy is going on......");
		
		engine.stop();
		System.out.println("Vehicle.journey End At :: " +endPlace);
		
		System.out.println("Vehicle.journey() journy is going on......");
		
		
	}
}











