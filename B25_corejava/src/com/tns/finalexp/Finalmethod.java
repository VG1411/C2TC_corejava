package com.tns.finalexp;


public class Finalmethod {
	 Finalmethod()
	 {
	System.out.println(" default constructor");	 
	 }
	final int a = 10;
	final void display() 
	{
		System.out.println(" value of a="+ a);	 	
	}
	public class Method extends Finalmethod
	{
		/*void display() {
			System.out.println("final method cannot be override");	 
		}*/
	}

	public static void main(String[] args) {
		Finalmethod fm = new Finalmethod(); // final class cannot be inherited
		fm.display();
	

	}
}
