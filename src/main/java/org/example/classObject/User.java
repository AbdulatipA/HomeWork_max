package org.example.classObject;

import java.util.Objects;

public class User implements Cloneable {
   private String name;
   private int age;
   private double balance;
   private String city;
   private String login;
   private String password;

    public User(String name, int age, double balance, String city, String login, String password) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.city = city;
        this.login = login;
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User: " + "name = " + name + ", age = " + age + ", balance = " + balance +
                ", city = " + city + ", login = " + login + ", password = " + password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
