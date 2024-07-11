/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.BloodBankDirectory;
import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class BloodBankOrganization extends Organizations{
    private BloodBankDirectory bloodBankDirectory;

    public BloodBankDirectory getBloodBankDirectory() {
        return bloodBankDirectory;
    }

    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }
    
    public BloodBankOrganization(){
        super(Organizations.Type.BloodBank.getValue());
        bloodBankDirectory = new BloodBankDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankManagerRole());
        return roles;
    }
}
