package problems;

import java.util.Scanner;

public class ReverseElement {
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

	        // Print array elements in reverse order
	        System.out.println("Array elements in reverse order:");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


