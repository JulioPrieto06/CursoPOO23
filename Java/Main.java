package Java;


class Main {

  public static void main(String[] args){
    System.out.println("Hola mundo");
    UberX uberX = new UberX("AMD123", new Acccount("Julio Prieto", "ADSWSN123"),"Toyota", "Yaris");
    uberX.passenger = 4;
    uberX.printDataCar();

    /*Car car2 = new Car("RMD985", new Acccount("Cesar Prieto", "WSEFED158"));
    car2.passenger = 4;
    car2.printDataCar();*/

  }
}