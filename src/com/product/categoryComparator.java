package com.product;

import java.util.Comparator;

public class categoryComparator implements Comparator<ProductCollections> {
    @Override
    public int compare(ProductCollections o1, ProductCollections o2) {
        return o1.category().compareTo(o2.category());
    }
}
