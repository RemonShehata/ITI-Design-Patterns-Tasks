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
public class Connection {

    static Connection con = null;

    private Connection() {
    }

    public static Connection getInstance() {
        if (con == null) {
            synchronized (Connection.class) {
                con = new Connection();
            }
        }
        return con;
    }
}
