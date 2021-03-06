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
public class ChickenSandwich extends Sandwich {

    Sandwich sandwich;

    public ChickenSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public ChickenSandwich() {
        if (sandwich == null) {
               this.sandwich = new Sandwich();
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Chicken";
    }

    @Override
    public float cost() {
        return 5f + super.cost();
    }

}
