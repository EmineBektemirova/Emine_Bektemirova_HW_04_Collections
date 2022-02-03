package com.product;

import java.util.Comparator;

public class costComparator implements Comparator <ProductCollections>  {
    @Override
    public int compare(ProductCollections o1, ProductCollections o2) {
        return Integer.compare(o1.cost, o2.cost);
    }
}

