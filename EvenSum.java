package com.part1;

public class EvenSum {
    void findSum(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            int sum = a + b;
            System.out.println("sum = " + sum);
        } else {
            System.out.println("both numbers are not even");
        }
    }

    public static void main(String[] args) {
        EvenSum n = new EvenSum();
        n.findSum(10, 20);
    }
}
