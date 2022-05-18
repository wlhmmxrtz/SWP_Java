package at.mow.project.calculator;

import java.util.Scanner;


import java.lang.Math;

public class Calculator {

    private double Wert1 = 0;
    private double Wert2 = 0;

    private double Ergebnis = 0;


    public Calculator(double Wert1, double Wert2, double Ergebnis){
        this.Wert1 = Wert1;
        this.Wert2 = Wert2;
        this.Ergebnis = Ergebnis;
    }

    public double getWert1() {
        return Wert1;
    }

    public void setWert1(double wert1) {
        Wert1 = wert1;
    }

    public double getWert2() {
        return Wert2;
    }

    public void setWert2(double wert2) {
        Wert2 = wert2;
    }

    public double getErgebnis() {
        return Ergebnis;
    }

    public void setErgebnis(double ergebnis) {
        Ergebnis = ergebnis;
    }


    public void addNumbers() {
        System.out.println("Geben sie ihre erste Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        System.out.println("Geben sie ihre zweite Zahl ein");
        Scanner numberScan2 = new Scanner(System.in);
        setWert2(numberScan2.nextDouble());

        setErgebnis(getWert1() + getWert2());

        System.out.println("Das Ergebnis ist " + getErgebnis());
    }

    public void subtractNumbers() {
        System.out.println("Geben sie ihre erste Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        System.out.println("Geben sie ihre zweite Zahl ein");
        Scanner numberScan2 = new Scanner(System.in);
        setWert2(numberScan2.nextDouble());

        setErgebnis(getWert1() - getWert2());

        System.out.println("Das Ergebnis ist " + getErgebnis());
    }

    public void multiplyNumbers() {
        System.out.println("Geben sie ihre erste Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        System.out.println("Geben sie ihre zweite Zahl ein");
        Scanner numberScan2 = new Scanner(System.in);
        setWert2(numberScan2.nextDouble());

        setErgebnis(getWert1() * getWert2());

        System.out.println("Das Ergebnis ist " + getErgebnis());
    }

    public void divideNumbers() {
        System.out.println("Geben sie ihre erste Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        System.out.println("Geben sie ihre zweite Zahl ein");
        Scanner numberScan2 = new Scanner(System.in);
        setWert2(numberScan2.nextDouble());

        setErgebnis(getWert1() / getWert2());

        System.out.println("Das Ergebnis ist " + getErgebnis());
    }

    public void percentOfNumber() {
        System.out.println("Wie viel Prozent sind ");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        System.out.println("von");
        Scanner numberScan2 = new Scanner(System.in);
        setWert2(numberScan2.nextDouble());

        setErgebnis((getWert1()*100) / getWert2());

        System.out.println("Das Ergebnis ist " + getErgebnis() + "%");
    }

    public void sinusOfNumber() {
        System.out.println("Geben sie eine Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        double sinRadians = Math.toRadians(getWert1());

        System.out.println("Der Sinus von " + getWert1() + " ist  " + Math.sin(sinRadians));
    }

    public void cosinusOfNumber() {
        System.out.println("Geben sie eine Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        double cosRadians = Math.toRadians(getWert1());

        System.out.println("Der Cosinus von " + getWert1() + " ist  " + Math.cos(cosRadians));
    }

    public void rootOfNumber() {
        System.out.println("Geben sie eine Zahl ein");
        Scanner numberScan1 = new Scanner(System.in);
        setWert1(numberScan1.nextDouble());

        double rootErgebnis = Math.sqrt(getWert1());

        System.out.println("Das Ergebnis ist " + rootErgebnis);
    }
}



