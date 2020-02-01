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
public class PresistFacade extends IFacade{
    Adapter presistAdapter = new PresistAdapter();
    Service persistService = new PersistService();
    
    @Override
    public void doAction(UserDTO user) {
        persistService.doService(presistAdapter.adapt(user));
    }
    
}
