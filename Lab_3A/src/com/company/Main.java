package com.company;
import java.util.Scanner;

public class 	Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of patients: ");

        int n = scanner.nextInt();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Patient number " + (i + 1) + ": ");
            Patient p = new Patient();
            p.setPatient();
            patients[i] = p;
        }

        int k = 1;
        while (k != 0) {
            System.out.println("1)Show\n" +
                    "2)Find diagnosis\n" +
                    "3)Medical id range\n" +
                    "4)Rooms and Flats\n" +
                    "5)Square\n" +
                    "0)Exit");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    for (int i = 0; i < n; i++) {
                       patients[i].show();
                       System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Diagnosis: ");
                    String diag = scanner.next();

                    System.out.println(diag);

                    System.out.println("Patients with " + diag + " diagnosis: ");

                    for (int i = 0; i < n; i++) {
                        System.out.println(patients[i].diagnosis + patients[i].diagnosis == diag);

                        if (patients[i].diagnosis.equals(diag)){
                            patients[i].show();
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Input minimal medical id: ");
                    int min = scanner.nextInt();

                    System.out.println("Input maximal medical id: ");
                    int max = scanner.nextInt();

                    System.out.println("Patients with medical id belong to (" + min + ", " + max + ") interval: ");

                    for (int i = 0; i < n; i++) {
                        if (patients[i].medicalId < max && patients[i].medicalId > min) {
                            patients[i].show();
                            System.out.println();
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Error!");
            }
        }
    }
}
