package problems;

import java.util.Scanner;

public class SumEvenIndex {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();          // size of array
	        int[] arr = new int[n];
	        int sum = 0;

	        // read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // sum of even indexed elements
	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 == 0) {
	                sum += arr[i];
	            }
	        }

	        System.out.println(sum);
	    }
	}


