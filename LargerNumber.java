package com.part1;

public class LargerNumber {
    void findLargerNumber(int a, int b) {
        if (a > b) {
            System.out.println("Larger = " + a);
        } else {
            System.out.println("Larger = " + b);
        }
    }

    public static void main(String[] args) {
        LargerNumber n = new LargerNumber();
        n.findLargerNumber(10, 20);
    }
}
