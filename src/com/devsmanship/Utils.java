package com.devsmanship;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<CarModelClass> doTheMapping(List<String> carLines) {
        List<CarModelClass> carList = new ArrayList<>();

        for(String carLine : carLines) {
            String[] carLineSplit = carLine.split(",");

            CarModelClass car = new CarModelClass();
            car.setModel(carLineSplit[0]);
            car.setThisIsTheYear(Integer.parseInt(carLineSplit[1]));
            car.setPrice(Double.parseDouble(carLineSplit[2]));
            car.setColor(carLineSplit[3]);
            car.setNumberOfDoors(Integer.parseInt(carLineSplit[4]));
            carList.add(car);
        }

        return carList;
    }
}
