/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author remon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sandwich sandwich = new ChickenSandwichWithCheese();
        Sandwich sandwich = new ChickenSandwichWithCheeseAndKetchup();
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.cost());
    }

}
