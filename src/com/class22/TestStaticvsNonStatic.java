package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		/* how to access static members
		 * the can be accessed by className
		 */
		
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		/*how to access non static memers
		 * they can be accessed by creating
		 * an object of that class
		 */
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="Dennis";
		obj.grade='A';
		//obj.getInfo(); possible not preferred
		

	}

}
