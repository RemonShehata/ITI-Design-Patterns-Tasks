/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer2;

import observer.*;

/**
 *
 * @author remon
 */
public class Display2 {

    public void update(float temperature, float pressure, float humidity) {
        System.out.println("============================");
        System.out.println("Display (2)");
        System.out.println("Temperature:" + temperature);
        System.out.println("Pressure:" + pressure);
        System.out.println("Humidity:" + humidity);
        System.out.println("============================");
    }
}
