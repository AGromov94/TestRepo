package com.company.TaskForLoops;

import java.util.Scanner;

public class Loops {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //taskOne();
        //taskTwo();
        //taskThree();
        taskFour();
    }

    public static void taskOne() {
        System.out.println("Enter size of square");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void taskTwo() {
        System.out.println("Enter size of base of triangle");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void taskThree() {
        System.out.println("Enter n");
        int n = scan.nextInt();
        int rows = ((2 * n + 1) + 1) / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void taskFour() {
        System.out.println("Enter n");
        int n = scan.nextInt();
        int rows = ((2 * n + 1) + 1) / 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i > 1; i--) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
