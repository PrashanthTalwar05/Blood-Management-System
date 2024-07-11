/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class GovernmentEnterprise extends Enterprise {
    
    public GovernmentEnterprise(String name){
        super(name,EnterpriseType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }

    
}
