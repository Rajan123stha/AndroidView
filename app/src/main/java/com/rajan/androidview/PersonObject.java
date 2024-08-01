package com.rajan.androidview;

public class PersonObject {

    final String name;
    final int age;
    final String occupation;
    final String address;

    public PersonObject(String name, int age, String occupation, String address){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getAddress(){
        return address;
    }
}
