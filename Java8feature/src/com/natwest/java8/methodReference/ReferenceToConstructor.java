package com.natwest.java8.methodReference;
interface  ProductDetails{
    Product getProduct(String name);
}
class Product{
    private String name;

    public Product(String s) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class ReferenceToConstructor {
    public static void main(String[] args) {
        ProductDetails productDetails = Product::new;
        Product product = productDetails.getProduct("laptop");

    }
}
