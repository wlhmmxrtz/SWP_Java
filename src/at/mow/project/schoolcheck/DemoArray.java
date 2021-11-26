package at.mow.project.schoolcheck;
import java.util.Random;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        String[] phrase1 = {"Er ", "Sie "};
        String[] phrase2 = {"geht ", "läuft ", "rennt ", "fährt "};
        String[] phrase3 = {"nach Hause", "zur Schule", "ins Büro", "zur Party"};

        System.out.println("Wie viele Sätze wollen sie generieren? - Geben sie die Anzahl unten ein.");
        Scanner phraseNumber = new Scanner(System.in);

        Random random = new Random();

        int selection = phraseNumber.nextInt();

        for (int i = 0; i < selection; i++) {
            int randomNumber1 = 1 + random.nextInt(2 - 1 + 1);
            int randomNumber2 = 1 + random.nextInt(4 - 1 + 1);
            int randomNumber3 = 1 + random.nextInt(4 - 1 + 1);

            int n1 = randomNumber1 - 1;
            int n2 = randomNumber2 - 1;
            int n3 = randomNumber3 - 1;

            System.out.println(phrase1[n1]+phrase2[n2]+phrase3[n3]);


        }

            System.out.println("Fertig, alle Sätze generiert.");




        }




    }
