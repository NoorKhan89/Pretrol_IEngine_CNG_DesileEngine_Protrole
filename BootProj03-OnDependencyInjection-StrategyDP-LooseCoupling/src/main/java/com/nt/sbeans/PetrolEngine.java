package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Lazy
public final class PetrolEngine implements IEngine
{

	public PetrolEngine() {
		System.out.println("PetrolEngine :: 0-Param Contructore()");
	}
	@Override
	public void start() {
		System.out.println("PetrolEngine.start() :: Petrol Engine is Started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop() :: Petrol Engine is Stoped");
		
	}

}
