package com.devsmanship;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Start {

    public void start() throws IOException {
        List<String> l = ImportFile.file;
        List<CarModelClass> carsThatAreMappedWithUtilsClass = Utils.doTheMapping(l);
        List<CarModelClass> Cars = Filtering.filter(carsThatAreMappedWithUtilsClass,2000, 0, true);
        Car_Service.printReportOneAndReportTwo(Cars, false);
    }
}
