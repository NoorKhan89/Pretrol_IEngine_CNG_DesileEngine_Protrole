package com.nt.client;

import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FactoryPstternProblemTest {

	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(2222222L,24,99999999L);//dependece class object
		
		Person st = new Student("Alli_khan","Hyd", details,1001, "DSA_JAva");  // target class object 
		System.out.println(st);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		AadharDetails details1 = new AadharDetails(333333333L ,45,8888888888L);
		Person per = new Employee("Ahammed","Dhelli", details1,1003, "Spring_AI");
		System.out.println(per);
	}

}
