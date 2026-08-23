package com.part1;

public class OddSum {
    void findSum(int a, int b) {
        if (a % 2 != 0 && b % 2 != 0) {
            int sum = a + b;
            System.out.println("sum = " + sum);
        } else {
            System.out.println("both numbers are not odd");
        }
    }

    public static void main(String[] args) {
        OddSum n = new OddSum();
        n.findSum(11, 21);
    }
}
