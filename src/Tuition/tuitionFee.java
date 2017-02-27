package Tuition;

import java.util.Scanner;

public class tuitionFee {
	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
	    int tuitionRate = s.nextInt();
	    int initialCost = 12342;
	    int total = initialCost * tuitionRate;
	    for (int i = 1; i <= 4; i++) {

	    	tuitionRate  += tuitionRate * initialCost;

	        if (i == 4) {
	            System.out.printf("The total tuition cost is $%.2f%n" + total);
	        }
	        }
	    }
	}
