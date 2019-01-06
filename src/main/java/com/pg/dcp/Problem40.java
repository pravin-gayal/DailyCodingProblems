package com.pg.dcp;

import java.util.Arrays;

/**
 * Given an array of integers where every integer occurs three times except for one integer,
 * which only occurs once, find and return the non-duplicated integer.
 * <p>
 * For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
 * <p>
 * Do this in O(N) time and O(1) space.
 */
public class Problem40 {
    public static void main(String[] args) {

        int[] arr1 = {1, 6, 6, 6, 7, 1, 1};
        findAndPrintNonDuplicateInt(arr1);

        int[] arr4 = {1, 6, 7, 6, 7, 1, 7};
        findAndPrintNonDuplicateInt(arr4);

        int[] arr5 = {6, 6, 7, 6, 7, 1, 7};
        findAndPrintNonDuplicateInt(arr5);

        int[] arr6 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 5, 6, 1, 2, 3, 5, 6};
        findAndPrintNonDuplicateInt(arr6);

        int[] arr2 = {15, 21, 15, 15};
        findAndPrintNonDuplicateInt(arr2);

        int[] arr3 = {6, 6, 6};
        findAndPrintNonDuplicateInt(arr3);
    }

    private static void findAndPrintNonDuplicateInt(int[] a) {
        System.out.println("array = " + Arrays.toString(a));
        System.out.println("Non Duplicate Int = " + findNonDuplicateInt(a));
        System.out.println("--------------------------------------");
    }

    private static int findNonDuplicateInt(int[] a) {
        // sort array
        Arrays.sort(a);

        // compare 1st and 3rd element for every 3
        for (int i = 0; i < a.length; i += 3) {
            if (i == a.length - 1) {
                return a[i];
            }
            if (i + 2 > a.length) {
                return -1;
            }

            if (a[i] != a[i + 2]) {
                return a[i];
            }
        }
        return -1;
    }
}
