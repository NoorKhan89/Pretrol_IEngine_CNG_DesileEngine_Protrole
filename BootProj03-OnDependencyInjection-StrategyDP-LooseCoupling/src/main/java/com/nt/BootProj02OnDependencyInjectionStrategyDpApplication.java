package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02OnDependencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		//Get IOC Container
		
	try( ConfigurableApplicationContext 
			ctx = SpringApplication.run(BootProj02OnDependencyInjectionStrategyDpApplication.class, args);){
	
	//get target class object from the container
	Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
	
	//invoke the b.method
	vehicle.journey("Khargone","Nizamabaad");
	
	} /// End try block
	
	catch (Exception e) {
		e.printStackTrace();
	}
	}

}
