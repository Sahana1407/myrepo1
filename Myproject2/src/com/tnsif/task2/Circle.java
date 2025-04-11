package com.tnsif.task2;
import java.util.*;

public class Circle {
	 double radius;
	  String color;
	  double pi =3.14;
	  
	  public double calcArea()
	  {
		  return pi*(radius*radius);
	  }
	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Circle obj = new Circle();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the color :-");
	    obj.color =sc.next();
	    System.out.println("Enter the radius cm : ");
	    obj.radius = sc.nextDouble();
	    double result = obj.calcArea();
	    System.out.println("Color of the circle : "+obj.color);
	    System.out.println("The area of the circle : " +result);
	    sc.close();
	    }

	}

	

