package com.company;

import java.util.Scanner;
import java.util.StringJoiner;

public class Patient {
    private
    Scanner sc = new Scanner(System.in);
    public

    static int id = 0;
    int phone, medicalId;

    String surname, name, secondName, diagnosis;

    void setPatient(){
        System.out.println("Name: ");
        String name = sc.nextLine();
        this.name = name;

        System.out.println("Surename: ");
        String surename = sc.nextLine();
        this.surname = surename;

        System.out.println("Second name: ");
        String secondName = sc.nextLine();
        this.secondName = secondName;

        System.out.println("Diagnosis: ");
        String diagnosis = sc.nextLine();
        this.diagnosis = diagnosis;

        System.out.println("Phone: ");
        int phone = sc.nextInt();
        this.phone = phone;

        System.out.println("Medical id: ");
        int medicalId = sc.nextInt();
        this.medicalId = medicalId;
    }

    void show(){
        System.out.println("Name: " + name + "\nSurename: " + surname + "\nSecond name: " + secondName + "\nPhone: " + phone + "\nMedical id: " + medicalId + "\nDiagnisis: " + diagnosis);
    }

    String getDiagnosis() {
        return diagnosis;
    }

    int getMedicalId() {
        return medicalId;
    }
}