package at.mow.project.test.objects;

public class lightElement {
    private int powerConsumption;
    public String name;
    private String color;
    private int status;


    public lightElement(int powerConsumption, String name, String color, int status){
        this.powerConsumption = powerConsumption;
        this.name = name;
        this.color = color;
        this.status = status;
    }

    public void powerUsage(){
        if (status == 1) {
            this.powerConsumption = powerConsumption + this.powerConsumption;
            System.out.println("Der Stromverbrauch ist " + this.powerConsumption);
        }
        else{
            this.powerConsumption = 0;
        }

    }

    public void turnOn(){
        this.status = 1;
        System.out.println(this.name + " ist jetzt eingeschaltet");
    }

    public void turnOff(){
        this.status = 0;
        System.out.println(this.name + " ist ausgeschaltet");
    }




}
