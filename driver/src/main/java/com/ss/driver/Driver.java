package com.ss.driver;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Driver {

 @Id
 @GeneratedValue
 private Long id;
 
 public Driver() {
}

 public Driver(String name, String licenseNumber) {
	 this.name = name;
	 this.licenseNumber = licenseNumber;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLicenseNumber() {
	return licenseNumber;
}
public void setLicenseNumber(String licenseNumber) {
	this.licenseNumber = licenseNumber;
}
private String name;
 private String licenseNumber;

}
