package at.mow.project.basics1;

import java.util.Random;
import java.util.Scanner;

public class WuerfelSpiel {
    public static void main(String[] args) {



        boolean isFinished = false;
        System.out.println("--- Bitte gib deinen Namen ein ---");
        Scanner namescan = new Scanner(System.in);
        String name = namescan.next();

        while (!isFinished) {

            int totalC = 0;
            int totalU = 0;

            System.out.println("--- Hallo " + name + " , bitte wähle eine Aktion ---");
            System.out.println("--- 1 Spiel starten ---");
            System.out.println("--- 2 Abbrechen ---");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                Random random = new Random();
                for (int i = 0; i < 7; i++) {
                    int randomNumberC = 1 + random.nextInt(6 - 1 + 1);
                    int randomNumberU = 1 + random.nextInt(6 - 1 + 1);
                    totalC += randomNumberC;
                    totalU += randomNumberU;
                }
                    if (totalC > totalU) {
                        System.out.println("Het is jammer, verloren. Dit bericht is in het Nederlands. De score op de computer was " + totalC + ", Je score was " + totalU);
                    } else if (totalC < totalU) {
                        System.out.println("Juhu vandt. Din score var " + totalU + ". Denne rapport er på dansk haha");
                    } else {
                        System.out.println("Svensk slips, försök igen. Resultatet blev " + totalC + " för datorn och " + totalU + " till dig.");
                    }

            } else {
                System.out.println("--- Wird geschlossen ---");
                isFinished = true;
            }

        }
    }
}










