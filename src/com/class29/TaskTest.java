package com.class29;

public class TaskTest {
public static void main(String[] args) {
	Task obj=new JavaFiles();
	Task obj1=new WordFile();
	Task obj2=new PDFFile();
	
	obj.open();
	obj.edit();
	obj.close();
	
	obj1.open();
	obj1.close();
	obj1.edit();
	
	obj2.open();
	obj2.edit();
	obj.close();
}
}
