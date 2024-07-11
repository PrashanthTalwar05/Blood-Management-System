/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.BloodBank;

/**
 *
 * @author krishna
 */
public class UpdateStockWorkRequest extends WorkRequest {

    private BloodBank bank;
    private String requestApproved;

    public BloodBank getBank() {
        return bank;
    }

    public void setBank(BloodBank bank) {
        this.bank = bank;
    }

    public String getRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(String requestApproved) {
        this.requestApproved = requestApproved;
    }
    
  

}
