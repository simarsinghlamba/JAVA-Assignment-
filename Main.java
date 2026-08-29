package com.conststatic;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    static String bankName;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    BankAccount() {
        this.accountNumber = "Unknown";
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void printAccountDetails() {
        System.out.println("Bank Name = " + bankName);
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Holder = " + accountHolder);
        System.out.println("Balance = " + balance);
    }

    static void setBankName(String name) {
        bankName = name;
    }
}

class Employee {
    String employeeId;
    String employeeName;
    double salary;

    static String companyName;
    static int employeeCount;

    Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    Employee() {
        this.employeeId = "Unknown";
        this.employeeName = "Unknown";
        this.salary = 0.0;
        employeeCount++;
    }

    void raiseSalary(double amount) {
        salary = salary + amount;
    }

    void printEmployeeDetails() {
        System.out.println("Company Name = " + companyName);
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Employee Name = " + employeeName);
        System.out.println("Salary = " + salary);
    }

    static void setCompanyName(String name) {
        companyName = name;
    }

    static void printEmployeeCount() {
        System.out.println("Total Employees = " + employeeCount);
    }

    static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployeeDetails();
        }
    }
}

class Product {
    String productId;
    String productName;
    double price;
    int quantity;

    static String storeName;
    static int totalProducts;

    Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    Product() {
        this.productId = "Unknown";
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
        totalProducts++;
    }

    void addStock(int amount) {
        quantity = quantity + amount;
    }

    void sellProduct(int amount) {
        if (amount <= quantity) {
            quantity = quantity - amount;
        } else {
            System.out.println("Not enough stock");
        }
    }

    void printProductDetails() {
        System.out.println("Store Name = " + storeName);
        System.out.println("Product ID = " + productId);
        System.out.println("Product Name = " + productName);
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);
    }

    static void setStoreName(String name) {
        storeName = name;
    }

    static void printTotalProducts() {
        System.out.println("Total Products = " + totalProducts);
    }

    static void printAllProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].printProductDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount.setBankName("State Bank");
        BankAccount account1 = new BankAccount("AC101", "Ravi Kumar", 5000.0);
        BankAccount account2 = new BankAccount();
        account1.deposit(1500.0);
        account1.withdraw(2000.0);
        account1.printAccountDetails();
        account2.printAccountDetails();

        Employee.setCompanyName("Tech Solutions");
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("E01", "Neha Verma", 45000.0);
        employees[1] = new Employee("E02", "Arjun Mehta", 50000.0);
        employees[2] = new Employee();
        employees[0].raiseSalary(5000.0);
        Employee.printAllEmployees(employees);
        Employee.printEmployeeCount();

        Product.setStoreName("City Grocery");
        Product[] products = new Product[3];
        products[0] = new Product("P01", "Rice", 60.0, 100);
        products[1] = new Product("P02", "Wheat Flour", 40.0, 150);
        products[2] = new Product();
        products[0].addStock(50);
        products[1].sellProduct(30);
        Product.printAllProducts(products);
        Product.printTotalProducts();
    }
}
