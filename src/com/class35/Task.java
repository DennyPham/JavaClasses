package com.class35;
import java.util.*;
public class Task {

	public static void main(String[] args) {
		HashMap<Integer, String> company=new HashMap<>();
		company.put(1, "Google");
		company.put(2, "Syntax");
		company.put(3, "Facebook");
		company.put(4, "Twitter");
		company.put(5, "Facebook");
		company.put(6, "Facebook");
		company.put(7, "Yahoo");
		
		int a=company.size();
		System.out.println(a);
		
		company.replace(4, "Instagram");
		company.remove(7);
		
		System.out.println(company);
		
	}

}
