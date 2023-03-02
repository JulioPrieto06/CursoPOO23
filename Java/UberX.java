package Java;

class UberX extends Car {
  String brand;
  String model;

  public UberX(String license, Acccount driver, String brand, String model){
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }
}