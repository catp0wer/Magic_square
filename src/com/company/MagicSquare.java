package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {

  //  public void MagicSquare(){
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your array: ");
//        int my_array = scanner.nextInt();


//}


 //   public void MagicSquare(String filePath){



  //  }

 //   public void printSquare(){

 //   }

    public void calculateSums(int[][]my_array){
        ArrayList<Integer> sumAllElements = new ArrayList<Integer>();

        //sum for Rows
        for (int row = 0; row < my_array.length; row++) {
            int sumRow = 0;
            for (int col = 0; col < my_array.length; col++) {
                System.out.print(my_array[row][col]);
                sumRow += my_array[row][col];
            }
            sumAllElements.add(sumRow);
            System.out.println();
            System.out.println("Sums of rows are " + sumAllElements);
        }

        //sum for Columns
        for (int col = 0; col < my_array.length; col++) {
            int sumCol = 0;
            for (int row = 0; row < my_array.length; row++) {
                System.out.print(my_array[row][col]);
                sumCol += my_array[row][col];
            }
            sumAllElements.add(sumCol);
            System.out.println();
            System.out.println("Sums of rows and columns are " + sumAllElements);
        }

        //sum for the first Diagonal
        int col = 0;
        int sumDiag = 0;
        for (int row = 0; row < my_array.length; row++) {
            System.out.print(my_array[row][col]);
            sumDiag += my_array[row][col];
            col++;

        }
        sumAllElements.add(sumDiag);
        System.out.println();
        System.out.println("Sums of rows, columns and the first diagonal are " + sumAllElements);

        //sum for the 2nd Diagonal
        int col2 = my_array.length - 1;
        int sumDiag2 = 0;
        for (int row = 0; row < my_array.length; row++) {
            System.out.print(my_array[row][col2]);
            sumDiag2 += my_array[row][col2];
            col2--;

        }
        sumAllElements.add(sumDiag2);
        System.out.println();
        System.out.println("Sums of rows, columns,first diagonal and the 2nd diagonal are " + sumAllElements);

    }

//    public void isMagicSquare(ArrayList sumAllElements){
//        System.out.println("size "+sumAllElements.size());
//        boolean isMagicSquare = true;
//        int firstElem=0;
//        for (int arrayElem = 0; arrayElem < sumAllElements.size()-1; arrayElem++) {
//            if (sumAllElements.get(firstElem) == sumAllElements.get(arrayElem + 1)) {
//                System.out.println("Element " + sumAllElements.get(firstElem) + " is equal to element " + sumAllElements.get(arrayElem + 1));
//
//            } else {
//                System.out.println("Element " + sumAllElements.get(firstElem) + " is not equal to element " + sumAllElements.get(arrayElem + 1));
//                isMagicSquare = false;
//                break;
//            }
//
//        }
//
//
//        if(isMagicSquare ==true){
//            System.out.println("This is a magic square");
//        }else{
//            System.out.println("This is not a magic square");
//        }
//    }
    }





