package com.devsmanship;

import java.util.List;

public class carRepository {

    public void save(List<CarModelClass> cars) {
        System.out.println(cars.size() + " cars saved.");

        Car_Service.printReportOneAndReportTwo(cars, true);
        // TODO: implement.
        // We won't implement it to keep the project simple
    }
}
