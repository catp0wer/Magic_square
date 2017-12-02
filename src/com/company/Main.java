package com.company;

import java.util.ArrayList;

//write a program that will check if a two dimensional arrays is magical square or not
public class Main {
    public static void main(String[] args) {
        int[][] my_array = new int[][]{
//                {1, 2, 3},
//                {5, 6, 7},
//                {6, 7, 8}

                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };

        MagicSquare square = new MagicSquare();
        ArrayList sumAllElements= square.calculateSums(my_array);
        //System.out.println(sumAllElements);
        square.isMagicSquare(sumAllElements);


    }
}
