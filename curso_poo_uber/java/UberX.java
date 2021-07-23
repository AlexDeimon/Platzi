package platzi.curso_poo_uber.java;

public class UberX extends CarBasic{

    public UberX(String licence, Account driver, String brand, String model) {
        super(licence, driver, brand, model);
    }
    
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + ", marca: " + brand);
    }
}
