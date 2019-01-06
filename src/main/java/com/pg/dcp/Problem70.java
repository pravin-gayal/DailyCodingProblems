package com.pg.dcp;

/**
 * A number is considered perfect if its digits sum up to exactly 10.
 * Given a positive integer n, return the n-th perfect number.
 * <p>
 * For example, given 1, you should return 19. Given 2, you should return 28.
 */
public class Problem70 {
    public static void main(String[] args) {
        findAndPrintPerfectNumber(2);
        findAndPrintPerfectNumber(3);
        findAndPrintPerfectNumber(9);
        findAndPrintPerfectNumber(12);
        findAndPrintPerfectNumber(47);
        findAndPrintPerfectNumber(55);

        // print 100 perfect numbers
//        printAllPerfectNumbersTill(100);
    }

    private static void printAllPerfectNumbersTill(int n) {
        for (int i = 1; i <= n; i++) {
            findAndPrintPerfectNumber(i);
        }
    }

    private static void findAndPrintPerfectNumber(int n) {
        long startTime = System.currentTimeMillis();
        int pn = findPerfectNumber(n);
        System.out.println("n = " + n + ",\tperfect number = " + pn + ",\ttime = " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static int findPerfectNumber(int n) {
        if (n < 1) {
            return -1;
        }

        int count = 1;
        for (int i = 19; ; i += 9) {
            int sum = getDigitSum(i);
            if (sum == 10 && count == n) {
                return i;
            } else if (sum == 10) {
                count++;
            }
        }
    }

    private static int getDigitSum(int i) {
        int sum = 0;
        while (i >= 1) {
            sum += (i % 10);
            i = (i / 10);
        }
        return sum;
    }
}
