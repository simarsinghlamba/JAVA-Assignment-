package com.part1;

public class SmallerNumber {
    void findSmallerNumber(int a, int b) {
        if (a < b) {
            System.out.println("Smallest = " + a);
        } else {
            System.out.println("Smallest = " + b);
        }
    }

    public static void main(String[] args) {
        SmallerNumber n = new SmallerNumber();
        n.findSmallerNumber(10, 20);
    }
}
