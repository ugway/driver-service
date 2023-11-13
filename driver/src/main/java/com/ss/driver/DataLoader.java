package com.ss.driver;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final DriverRepository driverRepository;

    public DataLoader(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Driver driver1 = new Driver("Anu Antony", "DL00012345");
        Driver driver2 = new Driver("Neethu Angel", "DL00067890");
        Driver driver3 = new Driver("Bob Marley", "DL000054321");
        driverRepository.saveAll(List.of(driver1, driver2, driver3));

    }
}
