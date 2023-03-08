package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  Map<String, Map<String, Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;
  private Integer passengers;

  public UberVan(String license, Account driver){
    super(license, driver);
  }

  public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
  ArrayList<String> seatsMaterial){
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }

  @Override
  public void setPassenger(Integer passenger) {
    if(passenger == 6){
      this.passengers = passenger;
    }else{
      System.out.println("You need to set 6 passengers");
    }
  }
}