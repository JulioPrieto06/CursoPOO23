package Java;

class Car {
  Integer id;
  String license;
  Acccount driver;
  Integer passenger;

  public Car(String license, Acccount driver){
    this.license = license;
    this.driver = driver;
  }

  void printDataCar(){
    System.out.println("License: " + license + " New Driver: " + driver.name + "Passengers: " + passenger);
  }

  
}
