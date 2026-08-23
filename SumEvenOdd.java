package com.part1;

public class SumEvenOdd {
    void checkSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
        if (sum % 2 == 0) {
            System.out.println("Sum is Even");
        } else {
            System.out.println("Sum is Odd");
        }
    }

    public static void main(String[] args) {
        SumEvenOdd n = new SumEvenOdd();
        n.checkSum(10, 5);
    }
}
