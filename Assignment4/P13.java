// /Write a program to define a class Item containing code and price. Accept this data for five objects using array of objects. Display code, price in tabular form and also, display  total price of all items.  

import java.util.Scanner;
public class P13 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            items[i].getDetails();
        }
        System.out.println("Code\tPrice");
        for (int i = 0; i < 5; i++) {
            items[i].display();
        }
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += items[i].price;
        }
        System.out.println("Total price: " + total);
    }
}

class Item {
    int code;
    double price;

    void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the code");
        code = s.nextInt();
        System.out.println("Enter the price");
        price = s.nextDouble();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

// Output:
// Enter the code
// 1
// Enter the price
// 100
// Enter the code
// 2
// Enter the price
// 200
// Enter the code
// 3
// Enter the price
// 300
// Enter the code
// 4
// Enter the price
// 400
// Enter the code
// 5
// Enter the price
// 500
// Code    Price
// 1       100.0
// 2       200.0
// 3       300.0
// 4       400.0
// 5       500.0
// Total price: 1500.0


