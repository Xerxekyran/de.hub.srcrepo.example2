package de.hub.srcexample2;

import de.hub.srcexample2.imported.Player;

public class HelloWorld {
	public static void main(String[] args) {
		(new HelloWorld()).sayHello();
		
		NewClass dependency = new NewClass();
		Player p = new Player();
		p.setAge(20);
		System.out.println(p.getAge());
	}
	
	public void sayHello() {
		System.out.println("Hello World");
	}
}
