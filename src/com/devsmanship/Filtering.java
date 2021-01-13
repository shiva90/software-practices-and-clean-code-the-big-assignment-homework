package com.devsmanship;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

    public static List<CarModelClass> filter(List<CarModelClass> cars, int year, double price, boolean filterYearOrPrice) {
        if(filterYearOrPrice) {
            return cars.stream()
                .filter(c -> c.getThisIsTheYear() > year)
                .collect(Collectors.toList());
        } else {
            return cars.stream()
                .filter(c -> c.getPrice() > price)
                .collect(Collectors.toList());
        }
    }
}
