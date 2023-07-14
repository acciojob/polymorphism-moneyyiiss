package com.driver;

//Task1


public class Main {

    public static class  Product{
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }
    
    public static void main(String[] args) {
        //Task2
        Product p = new Product();
        //Task3
        p.product(2, 3);
        //Task4
        p.product(2, 3, 4);
        
        //Task5
        p.product(2.5, 2.6);
    
        
        
    }
}