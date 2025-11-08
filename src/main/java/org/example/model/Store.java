package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 1.5, "Milk Chocolate", 5);
        products[1] = new Coke("Coke", 2.0, "Coca-Cola Classic", false);
        products[2] = new Bread("Bread", 3.0, "Whole Wheat Bread", "Wheat");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("--------------------");
        }
    }
}