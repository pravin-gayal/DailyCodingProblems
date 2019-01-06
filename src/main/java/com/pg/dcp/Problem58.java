package com.pg.dcp;

/**
 * An sorted array of integers was rotated an unknown number of times.
 * <p>
 * Given such an array, find the index of the element in the array in faster than linear time.
 * If the element doesn't exist in the array, return null.
 * <p>
 * For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).
 * <p>
 * You can assume all the integers in the array are unique.
 */
public class Problem58 {
    public static void main(String[] args) {

        int[] arr = {7, 1, 2, 3, 4, 5, 6};

        int i = searchInRotatedArray(arr, 0, arr.length - 1);
        if (i == -1) {
            System.out.println();
        }

    }

    static int searchInRotatedArray(int[] arr, int start, int end) {
return 0;
    }

}
