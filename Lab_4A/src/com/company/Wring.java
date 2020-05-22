package com.company;

import java.util.*;

public class Wring {
    Scanner scanner = new Scanner(System.in);

    int length;

    @Override
    public String toString() {
        return "Wring{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wring wring = (Wring) o;
        return length == wring.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    Wring(){
        System.out.println("Specify the wring length: ");
        int l = scanner.nextInt();

        if (l > 0){
            length = l;
        }else {
            System.out.println("Wrong wring length!");
        }
    }
}
