package models;

import java.util.Date;

public class Car{

  // Variables to represent the properties/attributes (in OO) of the class
  // they are called members of the class (in programming)
  // private to do validation, and prevent others from changing it easily
  private String colour;
  private String make;
  private String registration;
  private Date registrationDate;
  private Integer acceleration;

  // Constructors
  //  when you add a constructor, the default constructor disappears
  //  when creating a car, you need to input the registration'
  public Car(String registration){
    this.registration = registration;
  }

  public Car(String registration, String colour){
    this.registration = registration;
    this.colour = colour;

  }

  public Car(String registration, String colour, String make){
    this.registration = registration;
    this.colour = colour;
    this.make = make;
  }


  // Access methods to our members - getters and setters for the members
  // getMemberName, setMemberName
  public String getColour(){
    return this.colour.toUpperCase();
    // the word 'this' is a reserve word
    // there is greater control, like you can make the value to uppercase
    // the user can get the value, but they do not know how it is processed.
  }

  public void setColour(String colour){
    // since you are modifying the colour, you need to pass in the colour (String colour)
    this.colour = colour; 
    // first colour is the member, second is the parameter
  }

  public String getMake(){
    return this.make;
  }

  public void setMake(String make){
    if(make.equals("Toyota") || make.equals("Honda") || make.equals("Mazda")){
      this.make = make;
    } else{
      System.out.printf("%s not a permitted make", make);
    }

    // switch (make.toLowerCase()) {
    //   case "honda":
    //   case "toyota":
    //   case "mazda":
    //     this.make = make;
    //     break;
    //   default:
    // }
    
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public Date getRegistrationDate(){
    return registrationDate;
  }

  public void setRegistrationDate(Date registrationDate){
    this.registrationDate = registrationDate;
  }

  public Integer getAcceleration(){
    return acceleration;
  }

  // Behaviour - method
  public void horn(){
    System.out.println("Horn horn horn");
  }

  public void accelerate(){
    if (this.acceleration < 200){
      this.acceleration++;
    }
  }
    // you can overload methods and constructors
    // overload is only for different parameters, not different return type
  public void accelerate(Integer n){
    for(Integer i = 0; i<n; i++){
      accelerate();
    }
  }

  
  public void deccelrate(){
    if (this.acceleration > 0){
      this.acceleration--;
    }
    
  }
  

}