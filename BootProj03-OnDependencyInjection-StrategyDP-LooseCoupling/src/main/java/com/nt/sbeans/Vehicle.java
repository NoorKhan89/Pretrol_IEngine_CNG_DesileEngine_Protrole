package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
// HAS A properties for FeildEngine
	
	@Autowired
	
	// @Qualifier("${choose.engine}") --> place holder "${<key>} must be use only with @Values(...) annotation
//	@Qualifier(@Value("${choose.engine}") --> @Values("....")  can not be use insid the @Quilifier Annotation
	/*@Value("${choose.engine}")
	private String bid; 
	@Qualifier(bid)    ----> we can not pass veriable inside the annoataion
	*/

	@Qualifier("engg")
	private IEngine engine;
	
	public Vehicle() {
	System.out.println("Vehicle :: 0 - Param - Contructore");
	}
	
	public void journey(String startPlace, String endPlace)
	{
		System.out.println("Vehicle.Journey()");
		//start the engine to start journy
		engine.start();
		System.out.println("Vehicle.journey start From  :: {" +startPlace+"}");
		System.out.println("Vehicle.journey() journy is going on......");
		engine.stop();
		System.out.println("Vehicle.journey End At :: {" +endPlace +"}");
		System.out.println("Vehicle.journey() journy is going on......");
	}
}











