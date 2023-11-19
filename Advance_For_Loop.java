package com.Lecture7;

public class Advance_For_Loop {

	public static void main(String[] args) {
char[] vowel = {'a','e','i','o','u'};
for(char inList : vowel) {
	System.out.print(inList + " ");
}System.out.println(" ");
int[] numbers = {1,2,3,4,5};
int sum = 0;
for(int i : numbers) {
	System.out.println(i);
	sum = sum + i;
}
System.out.println(sum);
	}

}
