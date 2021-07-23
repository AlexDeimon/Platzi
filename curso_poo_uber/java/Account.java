package platzi.curso_poo_uber.java;

public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document, String email, String password){
        this.name = name;
        this.document =document;
        this.email =email;
        this.password = password;
    }
}
