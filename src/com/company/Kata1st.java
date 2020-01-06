package com.company;

import java.util.Arrays;

public class Kata1st {
    public static boolean isSquare(int n) { //You're a square! https://www.codewars.com/kata/54c27a33fb7da0db0100040e
        if (Math.sqrt(n) % 1 == 0) {
            return true;
        }
        return false;
    }

    public static int nbYear(int p0, double percent, int aug, int p) { //Growth of a Population https://www.codewars.com/kata/563b662a59afc2b5120000c6
        int year = 0;
        while (p0 <= p) {
            p0 = (int) (p0 + ((percent / 100) * p0) + aug);
            year++;
        }
        return year;
    }

    public static int sumOfDifferences(int[] arr) { //Sum of differences in array https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e
        int s = 0;
        int sum = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            s = arr[i] - arr[i + 1];
            sum += s;
        }
        return sum;
    }

    public static int digital_root(int n) { //Digital Root https://www.codewars.com/kata/541c8630095125aba6000c00
        int[] b = new int[10];
        while (n / 10 != 0) {
            for (int i = 0; i < 10; i++) {
                b[i] = n % 10;
                n = n / 10;
            }
            for (int i : b) {
                n += i;
            }
        }
        return n;
    }

    public static int DRoot(int n) { //Digital Root рекурсия
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            b[i] = n % 10;
            n = n / 10;
        }
        for (int i : b) {
            n += i;
        }
        if (n / 10 != 0) {
            n = DRoot(n);
        }
        return n;
    }

    public static double[] tribonacci(double[] s, int n) { //Tribonacci Sequence https://www.codewars.com/kata/556deca17c58da83c00002db
        double[] answer = new double[n];
        double[] emptyArr = new double[0]; //пустой массив

        if (n == 0) {
            return emptyArr;
        }

        if (n < 3) {
            System.arraycopy(s, 0, answer, 0, n);
            return answer;
        }

        System.arraycopy(s, 0, answer, 0, 3);

        int i = 3;

        while (i < n) {
            answer[i] = answer[i - 1] + answer[i - 2] + answer[i - 3];
            i++;
        }
        return answer;
    }

    public static int[] map(int[] arr) {
        for (int i=0; i<arr.length; i++){
            arr[i]*= 2;
        }
        return arr;
    }

    public static int squareDigits(int n) {
        String tempString = Integer.toString(n);
        int[] tempInt = new int[tempString.length()];
        String answer="";
        for (int i=0; i<tempString.length();i++){
            tempInt[i]=tempString.charAt(i)-'0';
            answer+=String.valueOf((int) Math.pow(tempInt[i], 2));
        }
        return Integer.valueOf(answer);
    }

    public static String highAndLow(String numbers) {
        String[] stringNumbers = numbers.split(" ");
        int[] intNumbers = new int[stringNumbers.length];
        String answer = "";
        for (int i = 0; i < stringNumbers.length; i++) {
            intNumbers[i] = Integer.valueOf(stringNumbers[i]);
        }
        for (int i = intNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intNumbers[j] > intNumbers[j + 1]) {
                    int tmp = intNumbers[j];
                    intNumbers[j] = intNumbers[j + 1];
                    intNumbers[j + 1] = tmp;
                }
            }
        }
        answer = Integer.toString(intNumbers[intNumbers.length - 1]) + " " + Integer.toString(intNumbers[0]);
        return answer;
    }

}
