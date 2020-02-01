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
public class ViewService {

    public UserDTO getUser() {
        UserDTO user = new UserDTO();
        user.setId(10);
        user.setFirstName("Moamen");
        user.setMiddleName("Adel");
        user.setLastName("Abdelmoneim");
        user.setSalary(1000f);
        user.setBonus(200f);
        user.setDeduction(100f);
        return user;
    }
}
