package problems;

import java.util.Scanner;

public class MaxElement {
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

	        // Assume array first element as maximum
	        int max = arr[0];

	        // Find maximum element
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        // Print maximum element
	        System.out.println("Maximum Element = " + max);
	    }
	}


