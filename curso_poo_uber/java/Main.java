package platzi.curso_poo_uber.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberx = new UberX("QWE105", new Account("Diego","11145062", "diego@gmail.com", "12345"), "Ford", "Fiesta");
        //uberx.passenger = 4;
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("QWE105", new Account("Diego","11145062", "diego@gmail.com", "12345"));
        ubervan.setPassenger(6);
        //uberx.passenger = 4;
        ubervan.printDataCar();
        
    }
}
