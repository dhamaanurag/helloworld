package com.igate.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {

	public static void main(String[] args) {
		System.out.println("Enter Details : ");
		
		ArrayList<String> arl = new ArrayList<String>();
		
		arl.add("Anurag");
		arl.add("Jitu");
		arl.add("Dhama");
		Iterator<String> itr= arl.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
