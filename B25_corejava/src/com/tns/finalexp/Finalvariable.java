package com.tns.finalexp;
public class Finalvariable {
	final int a=10;
	void display()
	{
		System.out.println("value= "+ a);
		int i=0;
		for(i=0;i<5;i++) 
		{
			System.out.println("value of i= " + i);
		}
	}
	void change()
	{
		//a=20; //final value of variable annot be changed
		System.out.println("value= "+ a);
	}
	public static void main(String[] args) {
		Finalvariable fv = new Finalvariable();
		fv.display();
		fv.change();

	}

}
