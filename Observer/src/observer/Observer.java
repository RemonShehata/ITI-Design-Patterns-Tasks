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
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         WeatherStatus weatherStatus = new WeatherStatus(new Display1(),new Display2(),new Display3(),null);
        weatherStatus.setTemperature(12.5f);
        weatherStatus.setPressure(11.5f);
        weatherStatus.setHumidity(22.4f);
        weatherStatus.weatherChanged();
    }
    
}
