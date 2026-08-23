package com.part1;

public class PositiveNegative {
    void printMyNumber(int number) {
        if (number < 0) {
            System.out.println("negative");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegative n = new PositiveNegative();
        n.printMyNumber(65);
    }
}
