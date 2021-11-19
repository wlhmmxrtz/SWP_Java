package at.mow.project.basics1;

import java.util.Random;

public class WhileLoop1 {

    public static void main(String[] args) {

        boolean Finished = false;

        int total = 0;

        while(!Finished){

            Random random = new Random();
            int randomNumber = 10 + random.nextInt(30 - 10 + 1);
            int randomNumber2 = 10 + random.nextInt(30 - 10 + 1);
            System.out.println("Numbers " + randomNumber + " and " + randomNumber2);

            var summe = randomNumber + randomNumber2;

            total += summe;


            if (randomNumber == 15 || randomNumber2 == 15) {

                Finished = true;

                System.out.println("Finished, one Number was 15");

            }
            else if (randomNumber == 25 || randomNumber2 == 25) {

                Finished = true;

                System.out.println("Finished, one Number was 25");
            }

            else {


            }
        }


        System.out.println("The Total of all the Numbers was " + total);

    }
}
