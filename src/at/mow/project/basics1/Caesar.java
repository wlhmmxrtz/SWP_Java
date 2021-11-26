package at.mow.project.basics1;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie einen Wort ein");

        String word = scanner.nextLine();

        System.out.println("Um wie viele Stellen soll verschoben werden? (1-10)");

        int encrypt = scanner.nextInt();


        if (encrypt >= 1 && encrypt <= 10) {

            char[] newword = word.toCharArray();
            char[] secret = encryptword(encrypt, newword);

            System.out.println("Hier das verschlüsselte Wort");

            for (int i = 0; i < secret.length; i++) {

                System.out.print(secret[i]);
            }
            System.out.println("\n");
            System.out.println("Wollen sie das Wort wieder entschlüsseln?");

        } else System.out.println("Die Verschiebung darf nur zwischen 1 und 10 sein");

    }
        public static char[] encryptword ( int offset, char[] charArray){

            char[] encryptArray = new char[charArray.length];


            for (int i = 0; i < charArray.length; i++) {

                int verschiebung = (charArray[i] + offset);

                encryptArray[i] = (char) (verschiebung);

            }
            return encryptArray;

        }
    public static char[] decryptword(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];

        int verschiebung;

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] - offset < 0)  verschiebung =
                    charArray[i] - offset + 128;

            else verschiebung = (charArray[i] - offset)%128;


            cryptArray[i] = (char) (verschiebung);

        }
        return cryptArray;

    }
    }
