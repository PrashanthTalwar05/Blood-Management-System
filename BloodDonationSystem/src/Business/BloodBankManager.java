/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class BloodBankManager extends User {

    private BloodBank bloodBank;

    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    public void setBloodBankByID(int id) {
        ArrayList<Enterprise> enterpriseList = EcoSystem.getInstance().getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList();
        Enterprise enterprise = enterpriseList.stream().filter(item -> "BloodBank".equals(item.getName())).findFirst().orElse(null);
        for (Organizations o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equalsIgnoreCase("BloodBank Organization")) {
                BloodBankOrganization hsoOrg = (BloodBankOrganization) o;
                this.bloodBank = hsoOrg.getBloodBankDirectory().getBloodBankByID(id);
                break;
            }
        }
    }

    public BloodBankManager(int id) {
        super(id);
    }
}
