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
public class PersistService implements Service{

    public void doService(UserEntity user) {
        System.out.println("===========================");
        System.out.println("Persist Service");
        System.out.println(user.getFullName());
        System.out.println(user.getNetSalary());
        System.out.println("===========================");
    }
}
