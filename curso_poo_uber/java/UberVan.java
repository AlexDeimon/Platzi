package platzi.curso_poo_uber.java;

//import java.util.*;

public class UberVan extends CarAdvanced{

    public UberVan(String licence, Account driver) {
        super(licence, driver);
    }
    
    @Override
    public void setPassenger(Integer passenger) {
        super.setPassenger(passenger);
    }
}
