///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Swap Every Other
// Course:          CS 200, Summer 2024, Jim Williams
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// None
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


///package org.example;

import java.util.Scanner;

/**
 * This class reads in two arrays of 12 integers and swaps the elements at odd indices. It prints
 * out the arrays' contents before and after making the swaps.
 *
 * @author Anna Lubienski
 * @author WHEN YOU CONTRIBUTE ADD YOUR NAME HERE
 */

public class SwapEveryOther {

    /**
     * This method takes an int array reference and returns a string with the formatted contents of
     * the array.
     *
     * @param arr The reference to an array of ints.
     * @return The contents of the array formatted as a string with vertical lines between elements
     * and brackets on either end. Spaces go between each character. For example: "[ 1 | 2 | 3 ]"
     */
    public static String formatArrayAsString(int[] arr) {

        String result = "[ ";

        int i;


        for (i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += " | ";
            }
        }

        result += " ]";

        return result;
    }

    /**
     * This method takes two int array references and swaps their values at a particular index.
     *
     * @param arr1  The reference to the first array of ints.
     * @param arr2  The reference to the second array of ints.
     * @param index The location of the elements to swap.
     */
    public static void swapValuesAtIndex(int[] arr1, int[] arr2, int index) {

        // This is a fun way of swapping int values without a temp variable. Consider tracing
        // this code on an example to help you understand how the swap happens.
        arr1[index] = arr1[index] + arr2[index];
        arr2[index] = arr1[index] - arr2[index];
        arr1[index] = arr1[index] - arr2[index];
    }

    /**
     * This method reads 12 ints into one array, and 12 ints into another. It prints the contents of
     * both arrays, swaps elements between arrays at every odd index, and then prints the final
     * contents of both arrays.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final int NUM_ITEMS = 12;
        int[] firstArray = new int[NUM_ITEMS];
        int[] secondArray = new int[NUM_ITEMS];
        Scanner scnr = new Scanner(System.in);
        int i;

        System.out.println("Enter values for first array: ");
        for ( i = 0; i < firstArray.length; ++i) {
            firstArray[i] = scnr.nextInt();
        }

        System.out.println("Enter values for second array: ");
        for ( i = 0; i < secondArray.length; ++i) {
            secondArray[i] = scnr.nextInt();
        }

        System.out.println("First array: " + formatArrayAsString(firstArray) + "\nSecond array: "
                + formatArrayAsString(secondArray));

        System.out.println("...swapping odd positions...");

        for (i = 0; i < 12; i++) {
            if (i % 2 != 0) {
                swapValuesAtIndex(firstArray, secondArray, i);

            }
        }

        System.out.println("First array: " + formatArrayAsString(firstArray) + "\nSecond array: "
                + formatArrayAsString(secondArray));

        scnr.close();
    }
}
