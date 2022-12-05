package models;

public class TurboChargedCar extends Car{
  // if you do not have a constructor (there is a default constructor) in Car class
  // then this class will not complain, 

  // but if Car class has a constructor (and the default constructor is hence gone)
  // then this class will complain that there is no constructor unless you do the following
  public TurboChargedCar(String registration){
    super(registration);
  }

  private Boolean turbo = false;


  // you will also want to modify the functionality, 
  // so you can provide the same method name as the parent class (override)
  // you can also have additional methods which are available in the child, not in the parent class
  
  public Boolean getTurbo() {
    return turbo;
  }


  public void setTurbo(Boolean turbo) {
    this.turbo = turbo;
  }


  // it will have the same method signature as the parent (override)
  @Override
  public void accelerate(){
    // if you do the below, it will just call itself
    // accelerate();
    // to call the parent class
    if(this.turbo){
      super.accelerate();
      super.accelerate();
      super.accelerate();
      super.accelerate();
      super.accelerate();
      System.out.println("Vroooom");
    } else{
      super.accelerate();
      System.out.println("Pfttt..");
    }

  }
  
}
