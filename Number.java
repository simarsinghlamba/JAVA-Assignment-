package com.part1;

public class Number {
    void checkEven(int number) {
        if (number % 2 == 0) {
            System.out.print("EVEN");
        }
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.checkEven(10);
    }
}
