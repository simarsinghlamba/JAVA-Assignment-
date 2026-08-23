package com.part1;

public class OddEven {
    void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        OddEven n = new OddEven();
        n.checkOddEven(65);
    }
}
