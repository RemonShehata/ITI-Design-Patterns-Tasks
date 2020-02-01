/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author remon
 */
public class Cash implements PaymentStrategy{

    @Override
    public void pay(float amount) {
        System.out.println("Pay using Cash (" + amount + ")");
    }
    
}
