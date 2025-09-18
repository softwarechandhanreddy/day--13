package com.codegnan.Arrays;
public class main {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {5, 30, 6},
            {7, 8}
        };

        // Printing using normal for loop
        System.out.println("Elements of 2D Array (using normal for loop):");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Printing using enhanced for loop
        System.out.println("\nElements of 2D Array (using enhanced for loop):");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
