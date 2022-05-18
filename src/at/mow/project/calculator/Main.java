package at.mow.project.calculator;

import at.mow.project.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

    Calculator c1 = new Calculator(0,0,0);

    System.out.println("Bitte Wählen sie eine Rechen-Art");

        System.out.println("1 - Addition");
        System.out.println("2 - Subtraktion");
        System.out.println("3 - Multiplikation");
        System.out.println("4 - Division");
        System.out.println("5 - %-Rechner");
        System.out.println("6 - Sinus");
        System.out.println("7 - Cosinus");
        System.out.println("8 - Wurzel");

    Scanner selectionScan = new Scanner(System.in);

    byte selection = selectionScan.nextByte();

    if(selection == 1) {
        c1.addNumbers();
    } else
        if(selection == 2){
            c1.subtractNumbers();
        } else
            if(selection == 3){
                c1.multiplyNumbers();
            } else
                if(selection == 4){
                    c1.divideNumbers();
                } else
                    if(selection == 5){
                        c1.percentOfNumber();
                    } else
                        if(selection == 6){
                            c1.sinusOfNumber();
                        } else
                            if(selection == 7){
                                c1.cosinusOfNumber();
                            }else
                                if(selection == 8){
                                    c1.rootOfNumber();5
                                } else {
                                    System.out.println("Error - keine gültige Eingabe");
                                }









}
}
