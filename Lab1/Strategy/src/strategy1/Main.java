package strategy1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author remon
 */
public class Main {
     public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay(Payment.CHECK, 1000);
    }
}
