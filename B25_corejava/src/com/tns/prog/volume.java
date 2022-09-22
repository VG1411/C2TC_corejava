package com.tns.prog;

public class volume {
	int cube ;
	int cuboid;
	double sphere;
	 
	int volume(int s)
	{
		cube=s*s*s;
		return cube;
	
	}
	int volume(int l,int b,int h)
	{
		cuboid = l*b*h;
		return cuboid;
	}
	double volume(double r)
	{
		sphere = (4/3)*(22/7)*r*r*r;
		return sphere;
	}
	public static void main(String[] args) {
	volume obj = new volume();
	System.out.println(" cube= "+ obj.volume(5));
	System.out.println(" cuboid= "+ obj.volume(5,10,12));
	System.out.println(" sphere= "+ obj.volume(2.5));
	

	}
}

