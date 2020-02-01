/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author remon
 */
public abstract class Drink {

    public void prepare() {
        boilWater();
        putIngredeint();
        addSugar();
    }

    private void boilWater() {
        System.out.println("Boil Water");
    }

    protected abstract void putIngredeint();

    private void addSugar() {
        System.out.println("Add sugar");
    }
}
