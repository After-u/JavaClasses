package com.company;

public class Country {
    String name;

    public Country(){}

    public Country(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void GetInfo(){
        System.out.println(this.name);
    }
}
