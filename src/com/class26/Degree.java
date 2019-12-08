package com.class26;

public class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}
}

class PostGraduate extends Degree{
	public void getDegree() {
		System.out.println("I am a post graduate");
	}
}

class UnderGraduate extends Degree{
	public void getDegree() {
		System.out.println("I am a under graduate");
	}
}