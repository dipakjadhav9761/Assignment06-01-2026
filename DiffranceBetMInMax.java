package problems;

import java.util.Scanner;

public class DiffranceBetMInMax {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();          // size of array
	        int[] arr = new int[n];

	        // read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int max = arr[0];
	        int min = arr[0];

	        // find max and min
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        // difference
	        int diff = max - min;

	        System.out.println(diff);
	    }
	}


