package problems;

import java.util.Scanner;

public class PositiveCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read size of array
	        System.out.print("Enter size of array: ");
	        int n = scanner.nextInt();

	        // Create an array
	        int[] arr = new int[n];

	        // Read array elements
	        System.out.println("Enter " + n + " array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Initialize counter
	        int positiveCount = 0;

	        // Count positive numbers
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > 0) {
	                positiveCount++;
	            }
	        }


	    }
}
