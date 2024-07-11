/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.HospitalDirectory;
import java.util.ArrayList;

/**
 *
 * @author prashanth
 */
public class HospitalOrganization extends Organizations {

    private HospitalDirectory hospitalDirectory;

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    
    public HospitalOrganization() {
        super(Organizations.Type.Hospital.getValue());
        hospitalDirectory = new HospitalDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerRole());
        return roles;
    }
}
