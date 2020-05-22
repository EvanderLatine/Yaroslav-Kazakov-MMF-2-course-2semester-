package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 5;

        Electronics things[] = new Electronics[N];
        Init(things);
        Show(things);
        System.out.println();

        ConsumedPower(things);
        System.out.println();

        FindThings(things);
        System.out.println();
    }

    static void Show(Electronics things[]){
        System.out.println("All available electronics: ");

        for (int i = 0; i < things.length; i++){
            things[i].Show();
        }
    }

    static void FindThings(Electronics things[]){
        Scanner sc = new Scanner(System.in);
        int k = 1;
        while (k != 0) {
            System.out.println("What do you want to use as filter?\n" +
                    "1)Power\n" +
                    "2)Model name\n" +
                    "3)Socket type\n" +
                    "4)Is on?\n" +
                    "5)Battery capacity\n" +
                    "6)CPU speed\n" +
                    "7)Cabel length\n" +
                    "8)Weight\n" +
                    "0)Exit\n" +
                    "Your pick: ");
            k = sc.nextInt();

            switch (k) {
                case 1:
                    int p;

                    System.out.println("What power do you want to find?");

                    p = sc.nextInt();

                    System.out.println("Suiteble gadgets: \n");

                    for (int i = 0; i < things.length; i++){
                        if (things[i].GetPower() == p){
                            things[i].Show();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Do you want to find active electronics?");
                case 3:
                    System.out.println("Do you want to find active electronics?");
                case 4:
                    boolean b;

                    System.out.println("Do you want to find active electronics?");

                    b = sc.nextBoolean();

                    System.out.println("Suiteble gadgets: ");

                    for (int i = 0; i < things.length; i++){
                        if (things[i].GetOn() == b){
                            things[i].Show();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Do you want to find active electronics?");
                case 6:
                    System.out.println("Do you want to find active electronics?");
                case 7:
                    System.out.println("Do you want to find active electronics?");
                case 8:
                    System.out.println("Do you want to find active electronics?");
                case 0:
                    break;
                default:
                    System.err.println("Error!");
            }
        }

    }

    static void ConsumedPower(Electronics things[]){
        int summ = 0;

        for (int i = 0; i < things.length; i++){
            if (things[i].isOn){
                summ += things[i].GetPower();
            }
        }

        System.out.println("Power consumed by all active electronics: " + summ + " W.");
    }

    static void Init(Electronics things[]){
        things[0] = new Gadgets(350, "6 x 12 Oval type", "ASUS laptop", true, 8000, (float)3.3);
        things[1] = new Gadgets(50, "USB Type-C", "SONY smartphone", true, 4000, (float)1.3);
        things[2] = new Appliances(450, "Type F", "SAMSUNG vacuum cleaner", false, 15, 5);
        things[3] = new Appliances(350, "Type F", "MULINEX mincer", true, 1, 3);
        things[4] = new Appliances(150, "Type F", "SAMSUNG hairdryer", false, 3, 1);
    }
}
