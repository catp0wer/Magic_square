package com.company;

import java.util.ArrayList;

//write a program that will check if a two dimensional arrays is magical square or not
public class Main {
    public static void main(String[] args) {
        int[][] my_array = new int[][]{{1, 2, 3},
                {5, 6, 7},
                {6, 7, 8}};

        for (int row = 0; row < my_array.length; row++) {
            int sumCol = 0;
            for (int col = 0; col < my_array.length; col++) {
                System.out.print(my_array[row][col]);
                sumCol+= my_array[row][col];
            }
            System.out.println();
            System.out.println("Sum of row is "+ sumCol);
        }
    }

}
