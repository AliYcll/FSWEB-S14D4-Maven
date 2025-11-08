package org.example.model;

public class Coke extends ProductForSale {
    private boolean isSugarFree;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, boolean isSugarFree) {
        super(type, price, description);
        this.isSugarFree = isSugarFree;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Sugar-Free: " + isSugarFree);
    }
}
