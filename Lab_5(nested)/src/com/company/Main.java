package com.company;

public class Main {
// вложенный статический
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        nestedObject.display();
    }
}
