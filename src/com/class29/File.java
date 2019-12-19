package com.class29;

public abstract class  File {
	public abstract void open();
	void edit() {		
	}
	void close() {	
}
}
class JavaFile extends File{
	@Override
	public void open() {
		System.out.println("to open javafile we need notepad");
	}	
}
class WordFile extends File {
	@Override
	public void open() {
		System.out.println("to open Word file we need microsoft word file");
		
	}}
class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("to open  PDF file we need PDF file");
	}}