package problems;

import java.util.Scanner;

public class EvenOddCounter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();      // size of array
	        int[] arr = new int[n];
	        int evenCount = 0;

	        // read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // count even numbers
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                evenCount++;
	            }
	        }

	        System.out.println("Even Count = " + evenCount);
	    }
	}

	
	    
	       