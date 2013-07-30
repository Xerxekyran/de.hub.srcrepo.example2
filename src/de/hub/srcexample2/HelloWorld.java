package de.hub.srcexample2;

public class HelloWorld {
	public static void main(String[] args) {
		(new HelloWorld()).sayHello();
		
		NewClass dependency = new NewClass();
	}
	
	public void sayHello() {
		System.out.println("Hello World");
	}
}
