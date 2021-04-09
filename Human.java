package com.company;

class Human {
    private int age;
    private char gender;
    private float height;

    Human(int age, char gender, float height) {
        this.age = age;
        this.gender = gender;
        this.height = height;
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
