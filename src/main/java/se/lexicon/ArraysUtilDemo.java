package se.lexicon;

import java.util.Arrays;

public class ArraysUtilDemo {

    public static void main(String[] args) {

        ex4();
    }

    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        // A - Z (65, 90)
        // a - z (97, 122)
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        /*for (String name : names){
            System.out.println(name);
        }*/
        System.out.println(Arrays.toString(names));


    }

    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
        Arrays.sort(numbers); // 200, 700, 900, 4555, 34500, 445000, 600000
        int index = Arrays.binarySearch(numbers, 4555);
        //System.out.println(index);
        if (index < 0) { // if the index is negative, means the value was not found in the array
            System.out.println("Data Not found");
        } else {
            System.out.println(index);
        }
    }

    public static void ex3() {
        int[] originalNumbers = {10, 20, 30, 40};
        int[] newArray = Arrays.copyOf(originalNumbers, originalNumbers.length + 1); // [10, 20, 30, 40, 0]


        newArray[newArray.length - 1] = 50; // [10, 20, 30, 40, 0]
        System.out.println(Arrays.toString(newArray));

    }

    public static void ex4() {
        char[] letters = {'J', 'A', 'V', 'A'}; // ['J', 'A', 'V', 'A']

        char[] referenceToOriginalArray = letters; // ['J', 'A', 'V', 'A']
        char[] copyOfTheOriginalArray = Arrays.copyOf(letters, letters.length); // ['J', 'A', 'V', 'A']

        letters[0] = 'L'; // ['L', 'A', 'V', 'A']

        System.out.println("ReferenceToOriginalArray: " + Arrays.toString(referenceToOriginalArray)); // ['J', 'A', 'V', 'A']
        System.out.println("copyOfTheOriginalArray: " + Arrays.toString(copyOfTheOriginalArray)); // ['J', 'A', 'V', 'A']


    }
}
