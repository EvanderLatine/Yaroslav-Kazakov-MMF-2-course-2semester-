package com.company;

import java.util.*;

public class Engine {
    Scanner scanner = new Scanner(System.in);

    int power;

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power);
    }

    Engine(){
        System.out.println("Specify engine power: ");
        int p = scanner.nextInt();

        if (p > 0){
            power = p;
        }else {
            System.out.println("Wrong value!");
        }
    }
}
