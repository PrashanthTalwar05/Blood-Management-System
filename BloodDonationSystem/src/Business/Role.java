/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EcoSystem;
import Business.Enterprise;
import Business.Organizations;
import javax.swing.JPanel;

/**
 *
 * @author krishna
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Person("Person"),
        Manager("Manager"),
        GovernmentAdmin("GovernmentAdmin"),
        BloodBankManager("BloodBankManager"),
        SystemAdmin("SystemAdmin");   
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organizations organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}