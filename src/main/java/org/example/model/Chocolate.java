package org.example.model;

public class Chocolate extends ProductForSale {
    private int sweetness;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, int sweetness) {
        super(type, price, description);
        this.sweetness = sweetness;
    }

    public int getSweetness() {
        return sweetness;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Sweetness: " + sweetness);
    }
}
