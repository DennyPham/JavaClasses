package com.class33;


import java.util.ArrayList;
import java.util.List;

public class InstructorList {

	public static void main(String[] args) {
		//create a list that will hold 5 Instructor
		List<Instructor> ilist=new ArrayList<>();
		ilist.add(new Instructor("Dennis","Pham"));
		ilist.add(new Instructor("Asel", "Umurzakova"));
		ilist.add(new Instructor("Harman","Mann"));
		ilist.add(new Instructor("Diego","Juarex"));
		
		for (Instructor i:ilist) {
			i.display();
		}
	}

}
