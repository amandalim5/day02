package main;

// use util, not sql? because you are using the util one in Car.java
// if it was using sql, then you use sql here too
import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {

  public static void main(String[] args) {
    Car myCar = new Car("S123A");
    Car myOtherCar = new Car("S321D");
    // List and Arrays are classes, 'new' is used when instantiating objects from a class
    // this Car() method has the same name as the class, these are called constructors
    // in the constructor method, there is also no return type (else it will be just a regular method)
    // whenever you create a class, you will get a free constructor
    // the free/default constructor, is an empty constructor

    myCar.setColour("red");
    myCar.setMake("Honda");
    myCar.setRegistration("S1234D");

    // because Date is a class, you have to instantiate the class Date first
    // create a new Date object 
    Date myDate = new Date();
    myCar.setRegistrationDate(myDate);
    // myCar.setRegistrationDate(new Date());

    // if you needed to use the sql Date class for some reason, use the Fully Qualified Class Name
    // java.sql.Date date = new java.sql.Date(123L);

    myCar.horn();
    System.out.printf("color: %s, make: %s, registration: %s\n", myCar.getColour(),myCar.getMake(),myCar.getRegistration());

    myCar.accelerate();
    myCar.accelerate();
    myCar.accelerate();

    System.out.printf("acceleration: %d\n", myCar.getAcceleration());


    if(myOtherCar instanceof TurboChargedCar){
      // Cast into a TurboCahrgedCar type
      TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
      turbo.setTurbo(true);
    }

    
  }
  
}
