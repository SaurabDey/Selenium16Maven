package com.selenium.test.Selenium16Maven;

public class Variables {

	//Global Variable 
	public String name="Saurab";// Instance variable
	public static String day="morning";//Class Variable
	
	public static void main(String[] args) 
	{
	//----------First
		Variables ref= new Variables();
		System.out.println("Before "+ref.name);//Saurab
		ref.name="Alim";
		System.out.println("After "+ref.name);//Alim
		
		
		System.out.println("Before "+Variables.day);//morning
		Variables.day="evening";
		System.out.println("After "+Variables.day);//evening

	//-----------Second		
		Variables ref2= new Variables();
		System.out.println("Second attemp Before "+ref2.name);//Saurab
		ref2.name="Yash";
		
		System.out.println("Second attemp Before "+Variables.day);//evening	
		
		Variables.day="night";
		System.out.println(Variables.day);
		
		//-----------Third	
		Variables ref3= new Variables();
		System.out.println(ref3.name);
		
		System.out.println(Variables.day);
		
	}
	
	public void testmethod(String browser) //browser=firefox
	{
		
		String randomvar="xyz";//Local Variable
		
		
		System.out.println(day);
		
		System.out.println("hello method"+randomvar+browser);
		
		
	}

}
