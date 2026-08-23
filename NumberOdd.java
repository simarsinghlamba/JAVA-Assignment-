package com.part1;

public class NumberOdd {
    void checkOdd(int number) {
        if (number % 2 != 0) {
            System.out.print("ODD");
        }
    }

    public static void main(String[] args) {
        NumberOdd n = new NumberOdd();
        n.checkOdd(11);
    }
}
