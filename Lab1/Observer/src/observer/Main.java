/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author remon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherStatus weatherStatus = new WeatherStatus();
        weatherStatus.setTemperature(12.5f);
        weatherStatus.setPressure(11.5f);
        weatherStatus.setHumidity(22.4f);
        weatherStatus.add(new Display1());
        weatherStatus.add(new Display2());
        weatherStatus.notifyall();
    }

}
