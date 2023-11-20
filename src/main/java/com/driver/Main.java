package com.driver;

public class Main {
    public Main() {
        System.out.println("Main Class");
    }

    public void main(String[] args) {
        Product p = new Product();
        p.product(4,5);
        p.product((long) 4.00,(long)5.00);
        p.product(4,5,7);
    }

    class Product
    {
        public Product() {
        }

        public void product(int a, int b)
        {

        }
        public void product(int a, int b, int c)
        {

        }
        public void product(long a, long b)
        {

        }
    }
}