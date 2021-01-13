package com.devsmanship;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car_Service {

    public void save() throws IOException {
        List<String> l = ImportFile.file;
        List<CarModelClass> carsThatAreMappedWithUtilsClass = Utils.doTheMapping(l);

        List<CarModelClass> FILTERED_CARS = Filtering.filter(carsThatAreMappedWithUtilsClass, 0, 1000, false);

        if(FILTERED_CARS.size() > 1 && FILTERED_CARS.get(0).getPrice() > 2000 && FILTERED_CARS.get(1).getModel().equals("AUDI")) {
            new carRepository().save(FILTERED_CARS);
        }
    }

    public void test() {
        /*File relativeFileThatIsReadFromTheSystem = new File("src/com/devsmanship/import.txt");

        try (Stream<String> stream = Files.lines(Paths.get(relativeFileThatIsReadFromTheSystem.toURI()))) {
            l = stream.collect(Collectors.toList());
        }
        List<CarModelClass> carsThatAreMappedWithUtilsClass = Utils.doTheMapping(l);
        new CarRepository().save(carsThatAreMappedWithUtilsClass);*/
    }
	
    public static void printReportOneAndReportTwo(List<CarModelClass> cars, boolean printOnlyTheFirstReport) {
        // print header
        System.out.println("===================");
        System.out.println("= Standard Report =");
        System.out.println("===================");
        System.out.println();

        // print cars
        for(CarModelClass car : cars) {
            System.out.println(String.format("Model: %s", car.getModel()));
            System.out.println(String.format("Year: %s", car.getThisIsTheYear()));
            System.out.println(String.format("Price: %s", car.getPrice()));
            System.out.println(String.format("Color: %s", car.getColor()));
            System.out.println(String.format("Number Of Doors: %s", car.getNumberOfDoors()));
            System.out.println();
        }

        // print footer
        System.out.println();
        System.out.println(String.format("Printed %s cars", cars.size()));
        System.out.println("=================");
        System.out.println("= End of Report =");
        System.out.println("=================");


        if(printOnlyTheFirstReport) {
            return;
        }


        // print header
        System.out.println("=====================");
        System.out.println("= Only Model Report =");
        System.out.println("=====================");
        System.out.println();

        // print cars
        for(CarModelClass car : cars) {
            System.out.println(String.format("Model: %s", car.getModel()));
            System.out.println();
        }

        // print footer
        System.out.println();
        System.out.println(String.format("Printed %s cars", cars.size()));
        System.out.println("=================");
        System.out.println("= End of Report =");
        System.out.println("=================");
    }
}
