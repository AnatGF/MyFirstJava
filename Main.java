package com.company;

public class Main {

    public static void main(String[] args) {
        Human maor = new Human(28, 'F', 1.70f);
        maor.setAge(99);
        maor.setGender('M');
        maor.introduceYourself();
        System.out.println(maor.getAge());
        System.out.println(maor.getGender());
    }
}
