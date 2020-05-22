package com.company;

import java.util.*;

public class Сhassis {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "Сhassis{" +
                "maxWeight=" + maxWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сhassis сhassis = (Сhassis) o;
        return maxWeight == сhassis.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeight);
    }

    int maxWeight;

    Сhassis(){
        System.out.println("Specify maximum weight per chassis: ");
        int w = scanner.nextInt();

        if (w > 0){
            maxWeight = w;
        }else {
            System.out.println("Wrong weight!");
        }
    }
}
