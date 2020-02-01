/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer2;

/**
 *
 * @author remon
 */
public abstract class Observer {
    protected abstract void update(float temperature, float pressure, float humidity);
}
