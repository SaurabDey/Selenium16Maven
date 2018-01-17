package com.selenium.test.Selenium16Maven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CollectionFrame 
{

	
	public static void main(String[] args) {
		
		String sent="This is my Country and I love it";
		int count=0;
		Map<Character, Integer> myMap=new HashMap<Character, Integer>();
		for (int i = 0; i < sent.length(); i++) {
			
			char[] letter= sent.toCharArray();
		
			if (myMap.containsKey(letter[i])) {
				myMap.put(letter[i], count++);
			}
			else
			{
				myMap.put(letter[i], 1);
			}
			
			
		}
		System.out.println(myMap);
		for (Character c : myMap.keySet()) 
		{
			System.out.println(c+" : "+myMap.get(c));
					}
	}
	
	
	
}
