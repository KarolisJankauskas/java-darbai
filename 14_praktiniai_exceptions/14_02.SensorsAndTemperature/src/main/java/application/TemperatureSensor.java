package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
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
        Random random = new Random();
        return random.nextInt(61) - 30;
    }
}
