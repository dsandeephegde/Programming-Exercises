package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DrawHorizontalLine();
        DrawVerticalLine();
        DrawRightAngleTriangle();
        IsoscelesTriangle();
        Diamond();
        DiamondWithName();
        FizzBuzz();
        PrimeFactor();
        //the new change
    }

    private static void PrimeFactor() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0)
                if(IsPrime(i))
                    System.out.print(i + "  ");
        }
        if(IsPrime(n))
            System.out.print(n+"  ");
    }

    private static boolean IsPrime(int n) {
        if(n<=1)
            return false;
        if(n<4)
            return true;
        if(n%2==0||n%3==0)
            return false;
        else if(n>5)
        {
            for (int j = 5; j < n/2; j=j+6) {
                if(n%j==0)
                    return false;
                if(n%(j+2)==0)
                    return false;
            }
        }
        else
            return true;
        return true;
    }

    private static void FizzBuzz() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%3==0 || i%5==0){

                if(i%3==0)
                    System.out.print("Fizz");
                if(i%5==0)
                    System.out.print("Buzz");
            }
            else
                System.out.print(i);
            System.out.println();
        }
    }

    private static void DiamondWithName() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Bill");
        for (int i = n-2; i >=0; i--) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void Diamond() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-2; i >=0; i--) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void IsoscelesTriangle() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void DrawRightAngleTriangle() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void DrawVerticalLine() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    private static void DrawHorizontalLine() {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
