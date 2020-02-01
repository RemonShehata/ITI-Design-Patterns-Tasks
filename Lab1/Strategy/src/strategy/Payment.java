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
public class Payment {

    PaymentStrategy ps;

    public Payment(PaymentStrategy ps) {
        this.ps = ps;
    }

    public void pay(float amount) {
        ps.pay(amount);
    }
}
