package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dereceyi giriniz");
        a = inp.nextInt();
        if (a < 5) {
            System.out.println("Kayak");
        }
            if (a >= 5 && a <= 15) {
                System.out.println("Sinema veya piknik");
            }
                if (a > 15 && a <= 25) {
                    System.out.println("Piknik");
                }
                    if (a > 25) {
                        System.out.println("Yüzme");
                    }
                }
            }



