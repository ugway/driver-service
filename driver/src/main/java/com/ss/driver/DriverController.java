package com.ss.driver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drivers")
public class DriverController {

 @Autowired
 private DriverRepository driverRepository;

 @GetMapping
 public List<Driver> getAllDrivers() {
     return driverRepository.findAll();
 }

 @GetMapping("/{driverId}")
 public ResponseEntity<Driver> getDriver(@PathVariable Long driverId) {
     Optional<Driver> driver = driverRepository.findById(driverId);
     return driver.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
 }
}

