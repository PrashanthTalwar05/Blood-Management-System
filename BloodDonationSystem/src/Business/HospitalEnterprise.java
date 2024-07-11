/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author prashanth
 */
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerRole());
        return roles;
    }

    
}
