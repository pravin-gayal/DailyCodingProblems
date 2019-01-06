package com.pg.dcp;

/**
 * Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.
 * <p>
 * For example, given the following matrix:
 * <p>
 * {{'F', 'A', 'C', 'I'},
 * {'O', 'B', 'Q', 'P'},
 * {'A', 'N', 'O', 'B'},
 * {'M', 'A', 'S', 'S'}}
 * and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word 'MASS', you should return true, since it's the last row.
 */
public class Problem63 {
    public static void main(String[] args) {
        char[][] arr = {
                {'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'N', 'O', 'B'},
                {'M', 'A', 'S', 'S'}
        };
        findAndPrintResult(arr, "FOAM");
        findAndPrintResult(arr, "MASS");
        findAndPrintResult(arr, "ABCD");
    }

    private static void findAndPrintResult(char[][] arr, String str) {
        int rows = arr.length;
        int cols = arr[0].length;

        boolean found = findWordInArray(arr, str, rows, cols);
        if (found) {
            System.out.println("Word: " + str + " found in array");
        } else {
            System.out.println("Word: " + str + " not found in array");
        }
        System.out.println("------------------------------" + arr.length);
    }


    private static boolean findWordInArray(char[][] arr, String str, int rows, int cols) {
        int i = 0;
        int j = 0;
        int c = 0;

        while (i < rows) {
            if (arr[i][j] == str.charAt(c)) {
                j++;
                c++;
                if (c >= str.length()) {
                    return true;
                }
            } else {
                i++;
                j = 0;
                c = 0;
            }
        }

        i = j = c = 0;
        while (j < cols) {
            if (arr[i][j] == str.charAt(c)) {
                i++;
                c++;
                if (c >= str.length()) {
                    return true;
                }
            } else {
                j++;
                i = 0;
                c = 0;
            }
        }
        return false;
    }

}
