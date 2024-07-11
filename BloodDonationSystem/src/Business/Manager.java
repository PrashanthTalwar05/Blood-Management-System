/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EcoSystem;
import Business.Enterprise;
import Business.Hospital;
import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class Manager extends User{
    
    private Hospital hospital;

   
    public Hospital getHospital() {
        return hospital;
    }
    public void setHospitalByID(int id){
        ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "Hospital".equals(item.getName())).findFirst().orElse(null);
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("Hospital Organization")) {
                HospitalOrganization hsoOrg = (HospitalOrganization) o;
                this.hospital = hsoOrg.getHospitalDirectory().getHospitalByID(id);
                break;
            }
        }
    }  

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    public Manager(int id){
        super(id);
    }
}
