package com.Lecture7;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Please enter the string you want to reverse");
String str = input.nextLine();
String reverse = " ";
for(int i = 0; i < str.length();i++) {
	reverse = str.charAt(i) + reverse;
}
System.out.println("Reversed string :-"  + reverse);
input.close();
	}

}
