package problems;

import java.util.Scanner;

public class CounterOccrerance {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();          // size of array
	        int[] arr = new int[n];

	        // read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int key = sc.nextInt();        // element to count
	        int count = 0;

	        // count occurrence
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                count++;
	            }
	        }

	        System.out.println(count);
	    }
	}


