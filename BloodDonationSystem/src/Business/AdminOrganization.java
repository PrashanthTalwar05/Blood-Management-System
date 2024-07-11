/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.LicenseDirectory;
import Business.TrainingDirectory;
import Government.Admin.GovernmentAdminDirectory;
import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class AdminOrganization extends Organizations{
    private GovernmentAdminDirectory governmentAdminDirectory;

    public GovernmentAdminDirectory getGovernmentAdminDirectory() {
        return governmentAdminDirectory;
    }

    public void setGovernmentAdminDirectory(GovernmentAdminDirectory governmentAdminDirectory) {
        this.governmentAdminDirectory = governmentAdminDirectory;
    }
    

    
    public AdminOrganization(){
        super(Organizations.Type.Admin.getValue());
        governmentAdminDirectory = new GovernmentAdminDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
}
