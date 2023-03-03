package Java;

class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passenger;

  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;

  }

  void printDataCar(){
    if(passenger != null){
      System.out.println("License: " + license + " New Driver: " + driver.name + " Passengers: " + passenger);
    }
  }

  public Integer getPassenger(){
    return passenger;
  }
  public void setPassenger(Integer passenger){
    if(passenger == 4){
    this.passenger = passenger;
  }else{
    System.out.println("You need to set 4 passengers");
  }
}
}
