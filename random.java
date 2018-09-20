// Created by Peter 
// Created on May
// This is a program about random number between 0 and maxValue

import java.util.Random;

public class random {
	 public static void main(String[] args) {
		 RollDie(10);      
	 }
	 
	 public static void RollDie(int maxValue) {
         int number;
		 
		 Random dice = new Random();	 
		 number = dice.nextInt(maxValue);
		 System.out.println("Your number is  " + maxValue);
		 System.out.println("The random number is  " + number);
	 }

}
