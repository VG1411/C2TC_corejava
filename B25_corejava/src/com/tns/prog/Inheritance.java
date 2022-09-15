package com.tns.prog;
class withdraw
{
	int amt_withdraw = 2000;
}
public class Inheritance extends withdraw {
int amt_left = 5000;
	public static void main(String[] args) {
		Inheritance ob1 = new Inheritance();
		System.out.println(" amt withdraw = "+ob1.amt_withdraw);

	}

}
