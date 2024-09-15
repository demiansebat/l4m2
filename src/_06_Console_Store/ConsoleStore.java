package _06_Console_Store;

import java.util.ArrayList;
import java.util.Scanner;

import _02_Generics_Store.*;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cart cart = new Cart();
		ArrayList<String> view = new ArrayList<String>();
		int stipend = 30;
		int cartPrice=0;
		int candyPrice=12;
		int cerealPrice=10;
		int clothingPrice=8;
		int toyPrice=15;
		do {

			System.out.println("1,Add || 2,Remove || 3,View || 4,Checkout");
			int option = scanner.nextInt();
			scanner.nextLine();
			if (option == 1) {
				System.out.println("1,Candy || 2,Cereal || 3,Clothing || 4,Toy");
				int added = scanner.nextInt();
				scanner.nextLine();
				if (added == 1) {
					cartPrice += 12;
				view.add("Candy");
					
				}
				if (added == 2) {
					cartPrice += 10;
					view.add("Cereal");
				}
				if (added == 3) {
					cartPrice += 8;
					view.add("Clothing");
				}
				if (added == 4) {
					cartPrice += 15;
					view.add("Toy");
				}

			}
			if (option == 2) {

			}
			if (option == 3) {
System.out.println(view);
			}
			if (option == 4) {
System.out.println("Reciept:");
for (int i = 0; i < view.size(); i++) {
	if(view.get(i).equals("Candy")) {
	System.out.println(view.get(i) + " " +candyPrice);
	}
	if(view.get(i).equals("Cereal")) {
		System.out.println(view.get(i) + " " +cerealPrice);
		}
	if(view.get(i).equals("Clothing")) {
		System.out.println(view.get(i) + " " +clothingPrice);
		}
	if(view.get(i).equals("Toy")) {
		System.out.println(view.get(i) + " " +toyPrice);
		}
}
			}
		} while (true);
	}

}
