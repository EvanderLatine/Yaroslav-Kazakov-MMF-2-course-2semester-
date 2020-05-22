package com.company;

import java.util.*;

public class Plane {
    Scanner scanner = new Scanner(System.in);
    String model;
    String route[];
    Wring wring;
    Сhassis chassis;
    Engine engine;


    Plane() {
        System.out.print("Model of the plane: ");
        model = scanner.next();
        wring = new Wring();
        chassis = new Сhassis();
        engine = new Engine();
        setRoute();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", route=" + Arrays.toString(route) +
                ", wring=" + wring +
                ", chassis=" + chassis +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(model, plane.model) &&
                Arrays.equals(route, plane.route) &&
                Objects.equals(wring, plane.wring) &&
                Objects.equals(chassis, plane.chassis) &&
                Objects.equals(engine, plane.engine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model, wring, chassis, engine);
        result = 31 * result + Arrays.hashCode(route);
        return result;
    }

    public void showRoute(){
        System.out.println("Plain rote is: ");

        for (int i = 0; i < route.length - 1; i++){
            System.out.print(route[i] + " -> ");
        }

        System.out.print(route[route.length - 1]);
    }

    public void setRoute(){
        System.out.print("How many destinations are in the route?: ");
        int n;
        n = scanner.nextInt();
        route = new String[n];

        System.out.println("Set all destinations, please: ");

        for (int i = 0; i < n; i++){
            route[i] = scanner.next();
        }

        System.out.println(route[0]);
    }

    public void toFly(){
        System.out.println("**Jet engine sounds**");
    }


}




