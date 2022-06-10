package at.mow.project.test.objects.second;

import java.util.Scanner;

import at.mow.project.test.objects.second.WaterTank;


public class CoffeeMachine {
    private String color;
    private int status;
    private WaterTank watertank;
    private int size;
    private int ammount;
    private int strongness;
    private int ammountOfBeans;


    public CoffeeMachine(String color, int status, WaterTank watertank, int size, int ammount, int strongness, int ammountOfBeans) {
        this.color = color;
        this.status = status;
        this.watertank = watertank;
        this.size = size;
        this.ammount = ammount;
        this.strongness = strongness;
        this.ammountOfBeans = ammountOfBeans;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmmountOfBeans() {
        return ammountOfBeans;
    }

    public void setAmmountOfBeans(int ammountOfBeans) {
        this.ammountOfBeans = ammountOfBeans;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getStrongness() {
        return strongness;
    }

    public void setStrongness(int strongness) {
        this.strongness = strongness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public WaterTank getWatertank() {
        return watertank;
    }

    public void setWatertank(WaterTank watertank) {
        this.watertank = watertank;
    }



    public void startCoffeeMachine() {
        setStatus(1);
        System.out.println("Kaffeemaschine ist eingeschaltet");
        System.out.println("Die Wassermenge beträgt " + watertank.getWaterlevel() + "ml, wollen sie Wasser auffüllen?");
        System.out.println("1 - Ja / 2 - Nein");
        Scanner selectScan1 = new Scanner(System.in);
        int selection1 = selectScan1.nextInt();
        if (selection1 == 1) {
            System.out.println("Wie viel Wasser möchten sie Auffüllen?");
            Scanner fillupScan = new Scanner(System.in);
            int fillupAmmount = fillupScan.nextInt();
            if (fillupAmmount + watertank.getWaterlevel() <= watertank.getVolume()) {
                watertank.setWaterlevel(watertank.getWaterlevel() + fillupAmmount);
                System.out.println("Füllstand: " + watertank.getWaterlevel() + "ml");
                System.out.println("Der Bohnenstand beträgt " + getAmmountOfBeans() + ", wollen sie Bohnen auffüllen?");
                System.out.println("1 - Ja / 2 - Nein");
                Scanner selectScan2 = new Scanner(System.in);
                int selection2 = selectScan2.nextInt();
                if (selection2 == 1) {
                    System.out.println("Wie viel Bohnen möchten sie hinzugeben?");
                    Scanner fillupScanBeans = new Scanner(System.in);
                    int fillupAmmountBeans = fillupScanBeans.nextInt();
                    if (fillupAmmountBeans + getAmmountOfBeans() <= getAmmount()) {
                        setAmmountOfBeans(getAmmountOfBeans() + fillupAmmountBeans);
                        System.out.println("Bohnenanzahl: " + getAmmountOfBeans());
                    } else {
                        System.out.println("Zu viele Bohnen");
                    }
                } else {
                }
            } else {
                System.out.println("Zu viel Wasser, der Tank würde überlaufen");

            }
        }
    }

    public void makeCoffee() {
        if (getStatus() == 1) {
            if (watertank.getWaterlevel() != 0) {
                if (getAmmountOfBeans() != 0){
                    System.out.println("Wie wollen sie ihren Kaffee haben?");
                    System.out.println("Stellen sie die Stärke ein (1-10)");
                    Scanner strongnessScan = new Scanner(System.in);
                    int strongnessAmmount = strongnessScan.nextInt();
                    setStrongness(strongnessAmmount);
                    System.out.println("Auf wie viel ml soll aufgegossen werden? (n in ml)");
                    Scanner sizeScan = new Scanner(System.in);
                    int sizeInMl = sizeScan.nextInt();
                    if(watertank.getWaterlevel()<sizeInMl){
                        System.out.println("Zu wenig Wasser im Tank, starten sie neu");
                    } else {
                        setSize(sizeInMl);
                        System.out.println("Der Kaffee wird mit der Stärke " + getStrongness() + " und " + getSize() + "ml Wasser gebrüht.");
                        watertank.setWaterlevel(watertank.getWaterlevel()-sizeInMl);
                        setAmmountOfBeans(getAmmountOfBeans()-strongnessAmmount);

                        System.out.println("Neuer Füllstand " + watertank.getWaterlevel() + "ml / Neue Anzahl Bohnen " + getAmmountOfBeans());

                    }
                }
            }
        }
    }


    public void turnOffCoffeemachine(){
        System.out.println("Kaffeemaschine wird nach Reinigung ausgeschalten");


    }


}
