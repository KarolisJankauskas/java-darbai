package application;

public class StandardSensor implements Sensor {


    public StandardSensor(int i) {

    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return 0;
    }
}
