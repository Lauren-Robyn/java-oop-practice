package com.practice;

public class Person {

    // TODO: add private age field
    private int age;
    // TODO: implement setter
    public void setAge(int age) {
        if( age >= 0 && age <= 130){
        this.age = (age);}

    }

    // TODO: implement getter
    public int getAge() {
        return age;
    }
}