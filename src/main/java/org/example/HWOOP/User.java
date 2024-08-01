package org.example.HWOOP;

public class User {
    String name;
    String email;
    int id;
    String password;


    public User(String name, String email, int id, String password) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name = " + name + "," + " Email = " + email + "," + " ID = " + id + "," + " Password = " + password;
    }

    public void info() {
        System.out.println("Имя = " + name + "," + " Email = " + email);
    }

    public void PrintCnnect() {
        System.out.println(name + " --> " + "подключился");
    }
}


