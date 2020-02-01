/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

/**
 *
 * @author remon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c = Connection.getInstance();
        Connection cc = Connection.getInstance();
        
        System.out.println(c.toString());
        System.out.println(cc.toString());
              
    }
    
}
