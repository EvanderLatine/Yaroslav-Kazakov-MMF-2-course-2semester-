package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Output(Input());
    }

    public static int[] Input(){
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько чисел вы хотите ввести?");

        int n = in.nextInt();

        int numbers[] = new int[n];


        for (int i = 0; i < n; i++){
            System.out.println("Введите число:");

            numbers[i] = in.nextInt();
        }

        return  numbers;
    }

    public static void Output(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0 || numbers[i] % 9 == 0)
            {
                System.out.print(numbers[i] + "  ");
            }
        }
    }
}

