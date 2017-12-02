package com.company;

import java.util.ArrayList;

//write a program that will check if a two dimensional arrays is magical square or not
public class Main {
    public static void main(String[] args){
        int[][]my_array = new int[][]{ {1,2,3},
                {5,6,7},
                {6,7,8} };

        ArrayList<Integer> sumAllElements = new ArrayList<Integer>();

        for (int row = 0; row <my_array.length; row++){
            int sumRow = 0;
            for(int col =0;col<my_array.length;col++){
                System.out.print(my_array[row][col]);
                sumRow+= my_array[row][col];
            }
            sumAllElements.add(sumRow);
            System.out.println();
            System.out.println("Sums of rows are " + sumAllElements);
        }


        for (int col = 0; col <my_array.length; col++){
            int sumCol = 0;
            for(int row =0;row<my_array.length;row++){
                System.out.print(my_array[row][col]);
                sumCol+= my_array[row][col];
            }
            sumAllElements.add(sumCol);
            System.out.println();
            System.out.println("Sums of rows and columns are " + sumAllElements);
        }
    }


}
