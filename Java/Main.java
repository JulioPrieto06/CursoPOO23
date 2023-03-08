package Java;


class Main {

  public static void main(String[] args){
    System.out.println("Hola mundo");
    UberX uberX = new UberX("AMD123", new Account("Julio Prieto", "ADSWSN123"),"Toyota", "Yaris");
    uberX.setPassenger(4);
    uberX.printDataCar();

    UberVan uberVan = new UberVan("JLK1234", new Account("César Domínguez", "DKS123"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();
    

  }
}