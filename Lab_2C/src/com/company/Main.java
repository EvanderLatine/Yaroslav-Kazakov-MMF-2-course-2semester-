package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.show();
        System.out.print("Наибольшее число последовательных монотонных элементов матрицы: ");
        System.out.println(matrix.findSequence());
    }
}
