package se.lexicon;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // Syntax: datatype[] arrayName = new datatype[size];
        int[] numbers = new int[3]; // [ 0 , 0 , 0 ]
        String[] names = new String[4]; // [ null , null , null , null ]
        int[] numbersArr = new int[]{8, 9, 7, 4, 2};
        int[] numbersArr2 = {8, 9, 7, 4, 2};
        char[] letters = {'J', 'A', 'V', 'A'};
        String[] daysOfWeek = {"Monday", "Tuesday"};

        sortEx();
    }

    public static void ex1() {
        String[] names = new String[3]; // [ null , null , null]
        names[0] = "Fredrik";           // [ "Fredrik" , null , null]
        names[names.length - 1] = "Marcus"; // [ "Fredrik" , null , "Marcus"]

        System.out.println("Size: " + names.length);
        System.out.println(names[0]); // Fredrik
        System.out.println(names[1]); // null
        System.out.println(names[2]); // Marcus
        //System.out.println(names[names.length]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7};
        System.out.println("Size:" + numbers.length); // Size = 5
        for (int i = 0; i < numbers.length; i++) {  // [5, 2, 3, 4, 7];
            if (i == 2) {
                numbers[i] = 3000;
            }
            System.out.println(numbers[i]);
        }
        System.out.println("----------------");
        for (int element : numbers) { //[5, 2, 3, 4, 7];
            System.out.println(element);
        }

        // Summary:
        // Use index-based loop when you need to access or want to modify elements by their index
        // Use enhanced for loop when we want or read the elements

    }

    public static void ex3() {
        int[] originalArray = {2, 5, 8, 1, 9}; // 5
        int[] newArray = new int[originalArray.length + 1]; // [ 0 , 0 , 0 , 0 , 0 , 0]
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        } // [ 2 , 5 , 8 , 1 , 9 , 0]
        newArray[newArray.length - 1] = 7;  // [ 2 , 5 , 8 , 1 , 9 , 7]

        System.out.println("New Array Size : " + newArray.length);
        for (int number : newArray) {
            System.out.println(number);
        }

    }

    /*
    Question:
    Write a program that finds the maximum number in a given array of ints.
     */
    public static void findTheMaxNumber() {
        int[] numbers = {5, 20, 3, 4, 7, 8, -10};
        // todo: needs completion
        // initial a variable with the value of the first element of the array
        int maxNumber = numbers[0]; // maxNumber = 20
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("Max Number is: " + maxNumber);
    }

    public static void ex4() {
        String[][] board = new String[3][3];
        // column    [0] [1] [2]
        //row[0] =  [ O , X , O]
        //row[1] =  [ O , X , X]
        //row[2] =  [ null , null , null]

        board[0][0] = "O"; // FIRST ROW, FIRST COLUMN
        board[0][1] = "X"; // FIRST ROW, SECOND COLUMN
        board[0][2] = "O"; // FIRST ROW, THIRD COLUMN

        board[1][0] = "O";
        board[1][1] = "X";
        board[1][2] = "x";

        // Outer loop iterate over each row
        for (int i = 0; i < board.length; i++) {
            // Inner loop iterate over each column of the current row
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();

        }


    }

    public static void sortEx() {
        int[] numbers = {5, 2, 1, 4, 7};
        Arrays.sort(numbers);

        /*
        // iterate through each element (loop)
        for (int i = 0; i < numbers.length -1; i++) { // 0
            for (int j = 0; j < numbers.length - 1 - i ; j++) {
                if (numbers[j] > numbers[j + 1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }*/

        for (int element: numbers){
            System.out.println(element);
        }

    }

}
