package com.driver;

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
        Product p = new Product();
        int ans1 = p.product(2, 3);
        int ans2 = p.product(2, 3, 4);
        double ans3 = p.product(2.5, 2.6);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}