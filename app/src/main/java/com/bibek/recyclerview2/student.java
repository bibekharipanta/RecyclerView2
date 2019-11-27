package com.bibek.recyclerview2;

public class student {
    private String name;
    private String Age;
    private String Address;
    private String Gender;

    public student(String name, String age, String address, String gender) {
        this.name = name;
        Age = age;
        Address = address;
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
