package at.mow.project.basics1;

import org.w3c.dom.Text;

import java.util.Scanner;

public class LetterCounter {
    public static void main(String args[]) {
        Scanner insertScan = new Scanner(System.in);

        System.out.println("Geben sie einen Satz ein");
        String originalText = insertScan.nextLine();


        char[] Text1 = originalText.toCharArray();
        int count = 0;

        for (int i = 0; i < Text1.length; i++) {
            count++;

        }
        System.out.println("der Text ist " + count + " Zeichen lang");
        System.out.println("Nach welchem Buchstaben wollen sie suchen? - bitte beachten sie die Groß- und Kleinschreibung!");


        char check = insertScan.next().charAt(0);


        int timesLetterUsed = 0;

        for (int i = 0; i < Text1.length; i++) {
            if (Text1[i] == check) {
                timesLetterUsed++;
            }
        }
        System.out.println("Der Buchstabe " + check + " wird " + timesLetterUsed + " mal benutzt.");
        return;
    }

}
