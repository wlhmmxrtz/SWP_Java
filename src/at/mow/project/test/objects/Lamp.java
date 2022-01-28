package at.mow.project.test.objects;

import at.mow.project.test.objects.lightElement;


public class Lamp {
    public static void main(String args[]) {

        int powerUsage = 0;

        lightElement l1 = new lightElement(1, "Blaue Lampe", "blue", 0);
        lightElement l2 = new lightElement(2, "Rote Lampe", "red", 0);
        lightElement l3 = new lightElement(1, "Gruene Lampe", "green", 0);
        lightElement l4 = new lightElement(3, "Leselampe", "warm white", 0);

        public void turnOnAll(){
            l1.turnOn();
            l2.turnOn();
            l3.turnOn();
            l4.turnOn();
            System.out.println("Alle Lampen sind eingeschaltet");
        }

        public void printNamesOfLightElements(){

            System.out.println("Die Namen sind: " l1.name + " " + l2.name + " " + l3.name + " " + l4.name);
        }

        public void getOverallPowerUsage{
            powerUsage =+ l1.powerUsage();
            powerUsage =+ l2.powerUsage();
            powerUsage =+ l3.powerUsage();
            powerUsage =+ l4.powerUsage();

            System.out.println(powerUsage);
        }

    }




}
