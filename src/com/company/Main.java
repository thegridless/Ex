package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Kata1st digits = new Kata1st();

        System.out.println(digits.nbYear(1000,2,50,1200)+"\n");

        System.out.println(digits.isSquare(26)+ " " + digits.isSquare(-1) + " " + digits.isSquare(4) + " " + digits.isSquare(25)+"\n");

        System.out.println(digits.sumOfDifferences(new int[]{2, 1, 10})+"\n");

        System.out.println(digits.digital_root(16)+ " " +digits.digital_root(942)+ " " +digits.digital_root(132189)+ " " +digits.digital_root(493193)+"\n");

        System.out.println(Arrays.toString((digits.tribonacci(new double[]{1,1,1}, 10)))+"\n");

        System.out.println(Arrays.toString(digits.map(new int[]{1,2,1}))+"\n");

        System.out.println(digits.squareDigits(8118)+"\n");

        System.out.println(digits.highAndLow("1 2 3 4 5")+"\n");



        Kata2nd strings = new Kata2nd();

    }


}