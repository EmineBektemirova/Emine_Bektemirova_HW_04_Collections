package com.product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ProductCollections hat = new ProductCollections("Hat", 250, "For women", "Great", ProductColor.red);

        ProductCollections dress = new ProductCollections("Dress", 150, "For women", "Base", ProductColor.green);

        ProductCollections coat = new ProductCollections("Coat", 200, "For men", "Great", ProductColor.blue);

        ProductCollections bag = new ProductCollections("Women bag", 100, "For women", "Fashion", ProductColor.red);


        ArrayList<ProductCollections> products = new ArrayList<>();
        products.add(hat);
        products.add(dress);
        products.add(coat);
        products.add(bag);

        ArrayList<ProductCollections> lessThan100CostList = new ArrayList<>();
        ArrayList<ProductCollections> categoryBaseList = new ArrayList<>();
        ArrayList<ProductCollections> colorRedList = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).cost > 100) {
                lessThan100CostList.add(products.get(i));
            }
            if (products.get(i).category.matches("(.*)Base(.*)")) {
                categoryBaseList.add(products.get(i));
            }
            if (products.get(i).color.equals(ProductColor.red)) {
                colorRedList.add(products.get(i));
            }

        }
        System.out.println(lessThan100CostList);
        System.out.println(categoryBaseList);
        System.out.println(colorRedList);

        products.sort(new costComparator());
        System.out.println("Sorted by cost: " + products);

        products.sort(new NameComparator());
        System.out.println("Sorted by name: " + products);

        products.sort(new categoryComparator());
        System.out.println("Sorted by category: " + products);
    }
}

