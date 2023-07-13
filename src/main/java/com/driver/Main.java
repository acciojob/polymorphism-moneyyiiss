package com.driver;

//Task1
class Product{
    public int product(int x, int y) {
        return x + y;
    }
    public int product(int x, int y, int z) {
        return x + y + z;
    }
    public double product(double x, double y) {
        return x + y;
    }
}

public class Main {
    
    public static void main(String[] args) {
//Task2
        Product p = new Product();
        //Task3
        int result1  = p.product(2, 3);
        System.out.println(result1);
        //Task4
        int result2  = p.product(2, 3, 4);
        System.out.println(result2);
        //Task5
        double result3  = p.product(2.5, 2.6);
        System.out.println(result3);
        
        
    }
}