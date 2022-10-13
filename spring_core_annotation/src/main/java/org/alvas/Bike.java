package org.alvas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component(value="mybike")
public class Bike {

	public void getBike()
	{
		System.out.println("KTM");
	}
	
}
