package com.company;
import java.util.Scanner;
import java.lang.Math;

/**
 * ffffffff ffff
 * @author Yaroslav Kazakov
 */
public class Array {
    int n;
    int[] array;

    Scanner scanner = new Scanner(System.in);

    Array(){
        System.out.print("n: ");
        n = scanner.nextInt();
        array = new int[n];

        for(int i = 0;i < n;i++){
            System.out.println("Введите число:");

            array[i] = scanner.nextInt();
        }
    }
    private int searchLength(){
        int size = 0;

        for(int i = 0;i < n;i++){
            size += size(array[i]);
        }

        return Math.round((float)size / array.length);
    }

    static private int size(int number) {
        int size = 0;

        while(number != 0){
            number /= 10;
            size++;
        }
        return size;
    }
    void showNumbers(){
        int avgSize = searchLength();

        System.out.println("Цифры больше средней длинны:");

        for(int i = 0;i < n;i++){
            if (size(array[i]) >= avgSize){
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
    }
}
