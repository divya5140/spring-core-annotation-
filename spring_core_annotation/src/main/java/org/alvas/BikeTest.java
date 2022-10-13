package org.alvas;

import org.alvas.Bike;
import org.alvas.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeTest {

	public static void main(String[] args) {
		 ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);

		 Bike bike=(Bike)applicationContext.getBean("mybike");
		 bike.getBike();
		 
	}

}
