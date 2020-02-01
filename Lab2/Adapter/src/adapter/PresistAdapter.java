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
public class PresistAdapter extends Adapter {

    @Override
    public UserEntity adapt(UserDTO udto) {
        UserEntity ue = new UserEntity();
        ue.setId(udto.getId());
        ue.setFullName(udto.getFirstName() + " " + udto.getMiddleName()
                + " " + udto.getLastName());

        ue.setNetSalary(udto.getSalary() + udto.getBonus() - udto.getDeduction());

        return ue;
    }

}
