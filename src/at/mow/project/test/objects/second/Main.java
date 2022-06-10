//Erstelle ein Programm für eine Kaffeemaschine. Es gibt folgendes Menu:
//
//	1) Einschalten
//	2) Größe des Cafees einstellen in ml
//		a. 40 - 200 ml sind möglich
//	3) Stärke einstellen
//		a. 1-10 ist möglich
//	4) Wasser nachfüllen
//	5) Bohnen nachfüllen
//	6) Kaffee rauslassen
//		a. eingeschaltet ist und der Wassertank und der Bohnenbehälter gefüllt sind
//		b. Laß einen Cafe raus mit der eingestellten Größe
//		c. Ziehe Wasser (der Wassertank hat 1000ml) und Bohnen ab (überleg dir selbst eine Maßeinheit)
//	7) Ausschalten
//
//Gib jeweils passende Meldungen auf der Konsole aus
//
//
//Test 2
//Erstelle eine OO Kaffeemaschine. Eine Kaffeemaschine hat einen Wassertank, einen Kaffeebehälter, eine Steuerung  (die merkt sich die Größe und die Stärke des Kaffees). Du kannst aber auch gerne die Kaffeemaschine nach Deiner Phantasie zusammenstellen.
//
//Erstelle eine Skizze (Klassendiagramm) und implementiere die Klassen





package at.mow.project.test.objects.second;

import at.mow.project.test.objects.second.CoffeeMachine;

import at.mow.project.test.objects.second.WaterTank;

public class Main {
    public static void main(String args[]) {

        WaterTank w1 = new WaterTank(1500,200);

        CoffeeMachine c1 = new CoffeeMachine("red", 0,w1,0,500,0,0);

        c1.startCoffeeMachine();

        c1.makeCoffee();

        c1.turnOffCoffeemachine();
    }
}
