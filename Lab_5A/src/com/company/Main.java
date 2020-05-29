package com.company;

public class Main{
//внутренний класс
    public static void main(String[] args) {

        Person tom = new Person("Tom", "qwerty", 1000, 100, 5000);
        tom.displayPerson();
        tom.account.displayAccount();
    }
}