package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        float grade =Float.parseFloat(sc.nextLine());
        if(grade <3.00){
            System.out.print("Failed!");
        }
        else {
            System.out.print("Passed!");
        }
    }
}
