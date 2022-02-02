package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String constantResult;
        String yourFried;
        final int NUM = 25;
        String word = "Aktan";
        constantResult = NUM + "" + word;
        System.out.print("constantResult");
        if (NUM < 0);{
            System.out.println("Вы сохронили отрицательное число");
        } if (NUM > 0);{
            System.out.println("Вы сохронили положительное число");
        } {
            System.out.println("Вы сохронили ноль");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Kanatbek");
        String name = in.next();
        System.out.println("Здравствуйте" + name + "!");
        in.close();
            }
        }