package com.company;

import java.util.Scanner;

public class Main {
enum Cards {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);
    int index;
    Cards(int index){
        this.index=index;
    }
    }
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        System.out.println("Ordinal value: "+Cards.CLUBS.index+"; Name value: "+Cards.CLUBS);
        System.out.println("Ordinal value: "+Cards.DIAMONDS.index+"; Name value: "+Cards.DIAMONDS);
        System.out.println("Ordinal value: "+Cards.HEARTS.index+"; Name value: "+Cards.HEARTS);
        System.out.println("Ordinal value: "+Cards.SPADES.index+"; Name value: "+Cards.SPADES);
    }
}
