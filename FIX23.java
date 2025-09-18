package com.codegnan.Arrays;

 public class FIX23 {
	public static int[] fix23(int[] n) {
		if(n[0]==2 && n[1]==3){
			n[1]=0;
		}if(n[1]==2 && n[2]==3) {
			n[2]=0;
		}return n;	
	}
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testCases = {{1,2,3},{1,2,2},{2,3,3},{2,3,2},{2,2,2},{2,2,3}};
		for(int i=0;i<testCases.length;i++) {
			int[] result = fix23(testCases[i]);
			System.out.println("Test Cases"+(i+1)+" : ");
			printArray(result);
		}
		
		
	}

}