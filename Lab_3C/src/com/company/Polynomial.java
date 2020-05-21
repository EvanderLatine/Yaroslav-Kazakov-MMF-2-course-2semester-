package com.company;

import java.util.Scanner;

public class Polynomial {
    Scanner in = new Scanner(System.in);

    int degree;
    Complex coeffs[];

    Polynomial(){
        setDegree(1);

        coeffs = new Complex[degree];

        for (int i = 0; i < degree; i++){
            Complex c = new Complex();
            coeffs[i] = c;
        }
    }

    public void setDegree(int d){
        if (d >= 0){
            degree = d;
        }else {
            System.out.println("Wond polinomial degree!");
        }

        coeffs = new Complex[degree];

        for (int i = 0; i < degree; i++){
            Complex c = new Complex();
            coeffs[i] = c;
        }
    }

    public void setCoeffs(float re, float im){
        for (int i = 0; i < degree; i++){
            System.out.println("Real part of " + (i + 1)  + " coefficient: ");
            coeffs[i].re = in.nextFloat();

            System.out.println("Imaginary part of " + (i + 1)  + " coefficient: ");
            coeffs[i].im = in.nextFloat();
            System.out.println();
        }
    }
    public void randCoeffs(){
        for (int i = 0; i < degree; i++){
            Complex c = new Complex((float)Math.random(), (float) Math.random());
            coeffs[i] = c;
        }
    }

    public void show(){
        for (int i = 0; i < degree - 1; i++){
            System.out.print("(" + coeffs[i].re + " + " + coeffs[i].im + ")x^" + (degree - i) + " + ");
        }
        System.out.println("(" + coeffs[degree - 1].re + " + " + coeffs[degree - 1].im + ")x");
    }

    Polynomial add(Polynomial a){
        Polynomial c = new Polynomial();
        c.setDegree(degree);

        for (int i = 0; i < degree; i++){
        c.coeffs[i].re = a.coeffs[i].re + this.coeffs[i].re;
        c.coeffs[i].im = a.coeffs[i].im + this.coeffs[i].im;
        }

        return c;
    }

    public class Complex {

        float re, im;

        Complex(){
            re = 0;
            im = 0;
        }

        Complex(float re, float im){
            this.re = re;
            this.im = im;
        }

        Complex add(Complex a, Complex b){
            Complex c = new Complex();

            c.im = a.im + b.im;
            c.re = a.re + b.re;

            return c;
        }
    }

}
