/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EcoSystem;
import Business.Enterprise;
import Business.DoctorOrganization;
import Business.Organizations;
import javax.swing.JPanel;
import userinterface.HospitalWorkArea.HospitalJPanel;

/**
 *
 * @author saurabhgangal
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise,business);
    }
    
    
}
