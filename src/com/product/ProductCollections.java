package com.product;

import java.util.Comparator;

public class ProductCollections implements Comparator {
    String name;
    int cost;
    String description;
    String category;
    ProductColor color;

    public ProductCollections(String name, int cost, String description, String category, ProductColor color) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.category = category;
        this.color = color;


    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCollections product = (ProductCollections) o;

        if (cost != product.cost) return false;
        if (!name.equals(product.name)) return false;
        if (!description.equals(product.description)) return false;
        if (!category.equals(product.category)) return false;
        return color == product.color;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + cost;
        result = 31 * result + description.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }


    public <T> Comparable name() {
        return name;
    }

    public <T> Comparable category() {
        return category;
    }
}






