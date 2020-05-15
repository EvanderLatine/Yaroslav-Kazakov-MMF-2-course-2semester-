package com.company;
import java.util.Scanner;
import java.util.Random;

public class Matrix {
    Scanner scanner=new Scanner(System.in);
    Random random = new Random();

    int n;
    int[][] matrix;

    Matrix(){
        System.out.print("n: ");
        n = scanner.nextInt();
        matrix = new int[n][n];
        for(int i = 0;i < n;i++)
            for(int j = 0;j < n;j++){
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
    }

    public int findSequence(){
        int maxIncreasingSequence = 0,
                maxDecreasingSequence = 0,
                counter = 0;

        for(int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 && i != n - 1) {
                    if (matrix[i][j] <= matrix[i + 1][0]) {
                        counter++;
                    } else {
                        if (maxIncreasingSequence < counter) {
                            maxIncreasingSequence = counter;
                        }
                        counter = 0;
                    }
                }
                if (j != n - 1) {
                    if ((matrix[i][j] <= matrix[i][j + 1])) {
                        counter++;
                    } else {
                        if (maxIncreasingSequence < counter) {
                            maxIncreasingSequence = counter;
                        }
                        counter = 0;
                    }
                }
            }
        }

        counter = 0;

        for(int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 && i != n - 1) {
                    if (matrix[i][j] >= matrix[i + 1][0]) {
                        counter++;
                    } else {
                        if (maxDecreasingSequence < counter) {
                            maxDecreasingSequence = counter;
                        }
                        counter = 0;
                    }
                }
                if (j != n - 1 && (matrix[i][j] >= matrix[i][j + 1])) {
                    counter++;
                } else {
                    if (maxDecreasingSequence < counter) {
                        maxDecreasingSequence = counter;
                    }
                    counter = 0;
                }
            }
        }

        return maxDecreasingSequence > maxIncreasingSequence ? maxDecreasingSequence : maxIncreasingSequence;
    }

    public void show(){
        for(int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
