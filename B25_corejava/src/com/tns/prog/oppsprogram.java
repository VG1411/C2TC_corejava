package com.tns.prog;

public class oppsprogram {
	int year_ofpurchase;
	String make;
	int model;
	double cost;
	public void display() {
		System.out.println("year of prchase="+2002);
		System.out.println("make="+"suzuki");
	}  
	void display1()
	{
		System.out.println("model" + 1999);
		System.out.println("make" + 50000);
	}
	public static void main(String[] args) {
		oppsprogram ob1 = new oppsprogram();
		ob1.display();
		ob1.display1();

	}

}
