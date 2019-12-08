package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Creating an object of Employee class");
		
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of ScrumTeam class");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=900000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product backlog, Sprint backlog, Burndown chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		
		System.out.println("Creating an object of Developer class");
		Developers dev = new Developers();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Spring Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		
		Tester t=new Tester();
		t.salary=100000;
		t.work();
		t.getPaid();
		t.test();
		t.artifacts="Sprint Backlog";
		t.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		t.attendScrumMeetings();
		
		
		
		
		
	}
}
