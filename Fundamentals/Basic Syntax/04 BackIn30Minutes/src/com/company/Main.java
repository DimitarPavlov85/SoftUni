package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt((sc.nextLine()));
        if (minutes + 30 >= 60) {

            if (hours != 23) {
                hours++;
            } else {
                hours = 0;
            }
            minutes = (minutes + 30 - 60);
            System.out.printf("%02d:%02d", hours, minutes);
        } else {
            minutes += 30;
            System.out.printf("%02d:%02d", hours, minutes);
        }
    }

}
