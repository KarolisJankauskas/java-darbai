package application;

public class AverageSensor implements Sensor{

    private Sensor toAdd;

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    public void addSensor(Sensor toAdd){
        this.toAdd = toAdd;
    }


    @Override
    public int read() {
        return 0;
    }
}
