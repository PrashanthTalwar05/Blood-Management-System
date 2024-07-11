/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author krishna
 */
public class PopulationEnterprise extends Enterprise {
    
    public PopulationEnterprise(String name){
        super(name,EnterpriseType.Population);
    }

    
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonRole());
        return roles;
    }

    
}
