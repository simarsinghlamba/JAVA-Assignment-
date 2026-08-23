package com.part2;

public class Part2 {
    static int totalItems = 0;

    String itemName;
    int quantity;

    Part2(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems = totalItems + quantity;
    }

    static int getTotalItems() {
        return totalItems;
    }

    void addToInventory(int amount) {
        quantity = quantity + amount;
        totalItems = totalItems + amount;
    }

    void removeFromInventory(int amount) {
        quantity = quantity - amount;
        totalItems = totalItems - amount;
    }

    public static void main(String[] args) {
        Part2 item1 = new Part2("Pencil", 10);
        Part2 item2 = new Part2("Textbook", 20);
        item1.addToInventory(5);
        item2.removeFromInventory(5);
        System.out.println("Total Items = " + Part2.getTotalItems());
    }
}
