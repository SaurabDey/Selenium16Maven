package com.selenium.test.Selenium16Maven;

import java.awt.SecondaryLoop;

public class Overload {

	public static void main(String[] args) 
	{
		Overload ref= new Overload();
		int comingValue=ref.add(70);		
		System.out.println(comingValue);
		
		int seondComingvalue=ref.add(90, 178);		
		System.out.println(seondComingvalue);
		
		int thirdCoingValue=ref.add(70, 65, 12);		
		System.out.println(thirdCoingValue);

	
	}

	
	public int add(int a)
	{	
		int value=a+100;
		return value;
	}
	
	
	public int add(int a, int b)//overloading
	{
		int value= a+b;
		
		return value;
	}
	
	public int add(int a, int b, int c)//overload
	{
		int value= a+b+c;
		return value;
	}
	

}
