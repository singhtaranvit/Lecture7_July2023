package com.Lecture7;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String Answer;
	do {
	System.out.println("Enter the number of the day");
	int n = input.nextInt();
	input.nextLine();
switch(n){
case 1:
		System.out.println("Monday");
		break;
case 2:
		System.out.println("Tuesday");
		break;
case 3:
		System.out.println("Wednesday");
		break;
case 4:
		System.out.println("Thursday");
		break;
case 5:
		System.out.println("Friday");
		break;
case 6:
		System.out.println("Saturday");
		break;
case 7:
		System.out.println("Sunday");
		break;
		default:
System.out.println("Please enter a valid day");
		}
System.out.println("Do you want to enter another day ? (Yes/No)");
	Answer = input.nextLine();
	}while(Answer.equalsIgnoreCase("Yes"));


	input.close();
	}

}
