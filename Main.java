package com.company;

public class Main {

    public static void main(String[] args) {
        Human maor = new Human(28, 'M', 1.70f);
        maor.setAge(99);
        maor.setGender('F');
        maor.introduceYourself();
        System.out.println(maor.getAge());
        System.out.println(maor.getGender());
    }
}
