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
public class Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drink tea = new Tea();
        tea.prepare();

        Drink coffee = new Coffee();
        coffee.prepare();
    }

}
