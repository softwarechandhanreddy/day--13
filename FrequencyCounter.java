package com.codegnan.Arrays;


import java.util.Scanner;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] p = new boolean[n];
        System.out.println("Enter integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	if(p[i]) {
        		continue;
        	}
	        int c = 1;
	        for(int j= i+1;j<n;j++) {
	        	if (arr[j] == arr[i]) {
	        		c++;
	        		p[j] = true;
	        	}
	        }
	        System.out.println(arr[i]+" occurs " +c+ " Times");
        }
        for (int i = 0; i < n; i++) {
            
            System.out.println(arr[i]);
        }

	}
}


