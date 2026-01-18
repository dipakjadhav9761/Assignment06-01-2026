package problems;

import java.util.Scanner;

public class EvenIndex {
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

	        // Print elements at even index positions
	        System.out.println("Elements at even index positions:");
	        for (int i = 0; i < arr.length; i += 2) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


