/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer2;

import java.util.ArrayList;
import java.util.List;
import observer.*;

/**
 *
 * @author remon
 */
public class WeatherStatus extends Subject{

    List<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float pressure;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    protected void add(Observer obs) {
        observers.add(obs);
    }

    @Override
    protected void remove(observer2.Observer obs) {
        observers.remove(obs);
    }

    @Override
    protected void notifyall() {
        for(Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }
}
