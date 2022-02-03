package com.product;

import java.util.Comparator;

public class NameComparator implements Comparator<ProductCollections> {
    @Override
    public int compare(ProductCollections o1, ProductCollections o2) {

        return o1.name().compareTo(o2.name());
    }
}




