package aufgabe5;

import java.util.Scanner;

public class Aufgabe5 {
    public static int kgv(int zahl1, int zahl2){
        int max = Math.max(zahl1, zahl2);
        int min = Math.min(zahl1, zahl2);

        int i = max;
        while(true){
            if(i % min == 0) {
                return i;
            }
            i += max;
        }
/*
        for(int i = max; ; i += max){
            if(i % min == 0){
                return i;
            }
        }
        */

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein: ");
        int zahl1 = input.nextInt();

        System.out.println("Gebe erneut eine Zahl ein: ");
        int zahl2 = input.nextInt();

        input.close();

        System.out.println("Das kleinste gemeinsame Vielfache ist: " + kgv(zahl1, zahl2));


    }
}
