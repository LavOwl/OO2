package ar.edu.info.unlp.ejercicioDemo;

public class User {
    private String name;
    private String surname;
    private String mail;
    
    public User(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }
}
