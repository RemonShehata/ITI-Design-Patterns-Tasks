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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewService viewService = new ViewService();
        UserDTO user = viewService.getUser();

//        Adapter adapter = new PresistAdapter();
//        UserEntity userEntity = adapter.adapt(user);
//        PersistService persistService = new PersistService();
//        persistService.persist(userEntity);
//
//        adapter = new PrintAdapter();
//        PrintService printService = new PrintService();
//        printService.print(userEntity);
        
        IFacade facade = new PresistFacade();
        facade.doAction(user);
        
        facade = new PresistFacade();
        facade.doAction(user);
    }

}
