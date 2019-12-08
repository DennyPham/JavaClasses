package com.class29;

public abstract class Task {

public abstract void open();

public void edit() {
	System.out.println("Edit");
}
public  void close() {
	System.out.println("Close");
}
}
class JavaFiles extends Task{

	
	public void open() {
		System.out.println("to open .java files we need notepad or sublime text");
	}
}

class WordFile extends Task{

	
	public void open() {
		System.out.println("to open .doc file you need Microsoft word to be installed");
	}
}

class PDFFile extends Task{

	
	public void open() {
		System.out.println("to open the pdf file using adobe reader");
	}
	
}
