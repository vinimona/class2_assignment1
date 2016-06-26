// Problem Statement : Write a Java program to allow the user to input his/her age. 
// Then the program has to show whether the person is eligible to vote or not.

package Class2_assignments;
import java.util.Scanner;

public class class2_assignment1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = scan_in.nextInt();
		if (age >= 18)
			System.out.println("You are eligible to vote.");
		else if (18 > age && age > 0)
			System.out.println("You are not eligible to vote.");
		else
			System.out.println("Invalid age (age should be non-negative).");
		
		if (scan_in != null)
			scan_in.close();
		
	}

}
