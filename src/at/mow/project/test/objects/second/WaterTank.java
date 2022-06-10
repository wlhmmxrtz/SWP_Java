package at.mow.project.test.objects.second;

public class WaterTank {
    private int volume;
    private int waterlevel;


    public WaterTank(int volume, int waterlevel) {
        this.volume = volume;
        this.waterlevel = waterlevel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWaterlevel() {
        return waterlevel;
    }

    public void setWaterlevel(int waterlevel) {
        this.waterlevel = waterlevel;
    }
}
