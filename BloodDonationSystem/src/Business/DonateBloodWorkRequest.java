/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.DonorTransaction;
import Business.Person;

/**
 *
 * @author krishna
 */
public class DonateBloodWorkRequest extends WorkRequest{
    private Person person;
    private DonorTransaction donorTransaction;
    private String requestApproved;

    public DonorTransaction getDonorTransaction() {
        return donorTransaction;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDonorTransaction(DonorTransaction donorTransaction) {
        this.donorTransaction = donorTransaction;
    }

    public String getRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(String requestApproved) {
        this.requestApproved = requestApproved;
    }
    
    
}
