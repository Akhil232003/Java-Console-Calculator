package task1;

import java.util.Scanner;

public class JavaConsoleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator...🙌");
		System.out.println("Whats your name ?");
		String name = sc.next();
		System.out.println("Hey " + name + " do you want to perform below operations...");
		boolean status = true;
		while (status) {
			System.out.println(
					" Press 1 addition \n press 2 for substraction \n press 3 for multiplication \n press 4 for division \n press 5 for exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter your first number");
				int n1 = sc.nextInt();
				System.out.println("Enter your second number:");
				int n2 = sc.nextInt();
				int res = n1 + n2;
				System.out.println("Your final output is " + res);
			}
				break;
			case 2: {
				System.out.println("Enter your first number");
				int m1 = sc.nextInt();
				System.out.println("Enter your second number:");
				int m2 = sc.nextInt();
				int res1 = m1 - m2;
				System.out.println("Your final output is " + res1);
			}
				break;
			case 3: {
				System.out.println("Enter your first number");
				int x1 = sc.nextInt();
				System.out.println("Enter your second number:");
				int x2 = sc.nextInt();
				int res2 = x1 * x2;
				System.out.println("Your final output is " + res2);
			}
				break;
			case 4: {
				System.out.println("Enter your first number");
				int a1 = sc.nextInt();
				System.out.println("Enter your second number:");
				int a2 = sc.nextInt();
				int res3 = a1 / a2;
				System.out.println("Your final output is " + res3);
			}
				break;
			case 5: {
				System.out.println("Thank You for using this calculator....");
				status = false;
			}
			}

		}

	}
}
