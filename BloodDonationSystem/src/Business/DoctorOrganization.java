/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.DoctorDirectory;
import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class DoctorOrganization extends Organizations {

    private DoctorDirectory doctorDirectory;

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    public DoctorOrganization() {
        super(Organizations.Type.Doctor.getValue());
        doctorDirectory = new DoctorDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
}
