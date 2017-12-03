package com.company;


import java.util.Scanner;

//write a program that will check if a two dimensional arrays is magical square or not
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String defaultPath = "D:\\Git projects\\Magic_square\\SquareGood.txt";
        System.out.println("Please enter the path to the file or press enter for default: ");
        String filePath = scanner.nextLine();
        System.out.println("Please enter the square length: ");
        int squareLength = scanner.nextInt();

        if(filePath.isEmpty()){
            filePath=defaultPath;
        }
        MagicSquare square = new MagicSquare(filePath,squareLength);

    }
}
