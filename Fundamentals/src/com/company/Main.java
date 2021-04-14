package com.company;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        String Name= cs.nextLine();
        int Age =Integer.parseInt(cs.nextLine());
        double Score =Double.parseDouble(cs.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",Name,Age,Score);
    }
}
