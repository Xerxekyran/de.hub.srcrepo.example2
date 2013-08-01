package de.hub.srcexample2;

import de.hub.srcexample2.imported.Player;

public class HelloWorld {
    /**
     * Starting point of the program
     * 
     * @param args
     *            argument list of the console
     */
    public static void main(String[] args) {
	NewClass dependency = new NewClass();
	(new HelloWorld()).sayHello(dependency);

	Player p = new Player();
	p.setAge(20);
	System.out.println(p.getAge());
    }

    /**
	 * 
	 */
    public void sayHello(NewClass nc) {
	System.out.println("Hello World");
    }

    /**
     * 
     * @param str
     * @param p
     */
    public void say(String str, Player p) {
	System.out.println(str);
    }

    public void say2() {
    }
}
