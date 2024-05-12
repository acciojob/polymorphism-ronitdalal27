package com.driver;

public class Main {
    class product{
        public int product(int x, int y) {

        }
        public int product(int x, int y, int z){

        }
        public double product(double x, double y){

        }
    }
    public static void main(String[] args) {
        product p = new product();   
        p.product(0, 0);
        p.product(0, 0, 0);
        p.product(0, 0);
    }
}