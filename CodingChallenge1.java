/* Challenge 1-
 * Java program to reverse a string without using the reverse method of Java's String class*/

package com.codecamp.codingchallenge;

public class CodingChallenge1 {
	
	public static void getStringinReverseOrder(String text) {
		for (int i=text.length();i>0;i--) {
			char[] arr= {text.charAt(i-1)};
			System.out.print(arr);
		}
			
			
	}

	public static void main(String[] args) {
		
		getStringinReverseOrder("abcd");



	}

}
