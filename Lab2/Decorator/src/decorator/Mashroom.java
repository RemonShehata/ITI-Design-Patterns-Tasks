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
public class Mashroom extends Extras {

    Sandwich sandwich;

    public Mashroom(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " with Mashroom";
    }

    @Override
    public float cost() {
        return 3f + sandwich.cost();
    }
}
