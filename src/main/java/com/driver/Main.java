package com.driver;

class product{
    public int product(int x, int y) {
        return 1;
    }
    public int product(int x, int y, int z){
        return 2;
    }
    public double product(double x, double y){
        return 3;
    }
}
public class Main {
    public static void main(String[] args) {
        product p = new product();   
        p.product(0, 0);
        p.product(0, 0, 0);
        p.product(0, 0);
    }
}