package com.company;

import com.company.example1.*;
import com.company.example2.ChristmasTree;
import com.company.example2.ChristmasTreeImpl;
import com.company.example2.TreeDecorator;
import com.company.example3.BasicCar;
import com.company.example3.Car;
import com.company.example3.LuxuryCar;
import com.company.example3.SportsCar;
import com.company.exmple4.*;

public class Main {

    public static void main(String[] args) {
	    Pizza pizza = new Margherita();
	    System.out.println(pizza.getDescription()+ "Cost :"+ pizza.getCost());

	    Pizza pizza1 = new Farmhouse();
	    pizza1 = new FreshTomato(pizza1);
	    pizza1 = new Paneer(pizza1);

	    System.out.println(pizza1.getDescription() + "Cost : " + pizza1.getCost());

//	    Pizza pizza2 = new Barbeque(null);
//	    System.out.println(pizza2.getDescription() + "Cost :" + pizza2.getCost());

//		example 3
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();

		Rolex rolex1 = new RolexImpl();
		rolex1 = new FreshTomatotoes(rolex1);
		rolex1 = new SlicedCabbages(rolex1);
		rolex1 = new RawOnions(rolex1);
		rolex1 = new KetchUp(rolex1);

		System.out.println(rolex1.getDescription() + "enjoy !!");

    }
}
