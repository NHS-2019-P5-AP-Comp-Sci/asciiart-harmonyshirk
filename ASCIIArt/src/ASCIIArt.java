/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

//** This is a fly with a human body. The fly's dream is to fly all the way to California and attend UC Berkeley. 

public class ASCIIArt {
	public static void head() {
		System.out.println("           o     o");
		System.out.println("            \\ _ /");
		System.out.println("            /   \\");
		System.out.println("           /@   @\\");
		System.out.println("        /\\ \\ ^   / /\\");
		System.out.println("       /  \\ \\___/ /  \\");
	}
	public static void body() {
		System.out.println("       \\   @|   |@   /");
		System.out.println("        \\ @/     \\@ /");
		System.out.println("         /|  Cal' |\\");
		System.out.println("        / |       | \\");
		System.out.println("       o  |       |  o");
		System.out.println("          +-------+");
	}
	public static void legs() {
		System.out.println("          |       |");
		System.out.println("          |       |");
		System.out.println("          O       O");
	}
	public static void main (String [] args) {
		head();
		body();
		legs();
	System.out.println("This is a fly with a human body. The fly's dream is to fly all the way to California and attend UC Berkeley.");
}
}