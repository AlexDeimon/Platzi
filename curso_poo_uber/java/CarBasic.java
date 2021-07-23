package platzi.curso_poo_uber.java;

public class CarBasic extends Car{
    String brand;
    String model;
    
    public CarBasic(String licence, Account driver, String brand, String model) {
        super(licence, driver);
        this.brand = brand;
        this.model = model;
    }
    
}
