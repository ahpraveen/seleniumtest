package com.google.page;

import java.util.*;
import java.util.Iterator;

public class StringJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a = new ArrayList<String>();
		a.add("Test");
		a.add("Testing");
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
