/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author remon
 */
public class PrintFacade extends IFacade {

    Adapter printAdapter = new PrintAdapter();
    Service printService = new PrintService();

    @Override
    protected void doAction(UserDTO user) {
        printService.doService(printAdapter.adapt(user));
    }

}
