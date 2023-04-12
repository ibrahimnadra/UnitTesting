package com.knoldus;
public class Person {

    private String name;
    private Integer age;
    private String email;

    public Person(){
        this.name = null;
        this.age = null;
        this.email = null;
    }

    public Person(String name, Integer age, String email) throws InvalidAgeException {
        this.name = name;
        //when age is negative
        if(age <= 0) throw new InvalidAgeException();
        else this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws InvalidAgeException {
        if(age <= 0) throw new InvalidAgeException();
        else this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
