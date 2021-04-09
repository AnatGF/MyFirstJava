package com.company;

class Human {
    private int age;
    private char gender;

    Human(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // constructor

    void introduceYourself() {
        System.out.println("My age is: " + age);
        System.out.println("My gender is: " + gender);
    }
}
