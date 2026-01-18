package problems;

import java.util.Scanner;

public class LinearSearch {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();          // size of array
	        int[] arr = new int[n];

	        // read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int key = sc.nextInt();        // element to search
	        boolean found = false;

	        // linear search
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("Element Found");
	        } else {
	            System.out.println("Element Not Found");
	        }
	    }
	}
