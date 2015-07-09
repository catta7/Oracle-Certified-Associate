/** 
 *  Simple class to demonstrate while loop.
 *  Take user input
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.javastatements;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		//do while loop
		
		// display menu
		System.out.println("1. How many games to you want to play (0 quits)?");
		
		// get user choice
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your choice > ");
		int userChoice = scan.nextInt();
		
		// act based on user choice
		System.out.println("You chose " + userChoice);
		
		
		// while loop
		int lives = userChoice;
		while(lives > 0){
			System.out.println("Playing game...");
			lives--;
		}
		System.out.println(lives + " lives left, Game over");

		
	}

}
