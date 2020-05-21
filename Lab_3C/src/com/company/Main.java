package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many polinomials you would like to add?");
        int n  = in.nextInt();

        Polynomial pols[] = new Polynomial[n];

        for (int i = 0; i < n; i++){
            Polynomial p = new Polynomial();
            pols[i] = p;
        }

        System.out.println("What degree should polinomials be?");
        int deg  = in.nextInt();

        for (int i = 0; i < n ; i++){
            pols[i].setDegree(deg);
            pols[i].randCoeffs();
        }

        System.out.println("Obtained polynomials: ");

        for (int i = 0; i < n ; i++){
            pols[i].show();
        }

        Polynomial summ = pols[0];

        for (int i = 1; i < n; i++){
            summ = summ.add(pols[i]);
        }

        System.out.print("Result of addition of polinomials is: ");
        summ.show();
        System.out.println();
    }
}
