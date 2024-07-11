/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Population;

import Business.EcoSystem;
import Business.BloodBankEnterprise;
import Business.Enterprise;
import Business.PopulationEnterprise;
import Business.Network;
import Business.BloodBankOrganization;
import Business.Organizations;
import Business.PersonOrganization;
import Business.DonorTransaction;
import Business.Person;
import Business.PersonDirectory;
import Business.UserAccount;
import Business.DonateBloodWorkRequest;
import Business.WorkRequest;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prashanth
 */
public class ViewDonationHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewDonationHistory
     */
    PersonDirectory personDirectory;
    JPanel userProcessContainer;
    EcoSystem business;
    Enterprise enterprise;
    UserAccount userAccount;

    public ViewDonationHistory(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        viewDonationHist();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donorTable = new javax.swing.JTable();
        btnUpdateDonor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donorTrnTable = new javax.swing.JTable();
        btnDeleteTrn = new javax.swing.JButton();
        donorLbl = new javax.swing.JLabel();
        trnLbl = new javax.swing.JLabel();
        btnDonate = new javax.swing.JButton();
        btnUpdateDonor1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        donorTable.setBackground(new java.awt.Color(204, 255, 255));
        donorTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        donorTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "Email", "Phone Number", "Blood Group"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        donorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(donorTable);
        if (donorTable.getColumnModel().getColumnCount() > 0) {
            donorTable.getColumnModel().getColumn(0).setMinWidth(1);
            donorTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            donorTable.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnUpdateDonor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateDonor.setText("Update");
        btnUpdateDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDonorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("View Donation History");

        donorTrnTable.setBackground(new java.awt.Color(204, 255, 255));
        donorTrnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        donorTrnTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        donorTrnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Age", "Weight", "Height", "Hemoglobin Level", "Blood Last Donated Date", "Blood Donation Date", "Number of Units", "Other Diseases", "Price", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(donorTrnTable);
        if (donorTrnTable.getColumnModel().getColumnCount() > 0) {
            donorTrnTable.getColumnModel().getColumn(0).setMinWidth(1);
            donorTrnTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            donorTrnTable.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        btnDeleteTrn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteTrn.setText("Delete");
        btnDeleteTrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTrnActionPerformed(evt);
            }
        });

        donorLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        donorLbl.setText("Donor Details:");

        trnLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trnLbl.setText("Transaction Details:");

        btnDonate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        btnUpdateDonor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateDonor1.setText("Update");
        btnUpdateDonor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDonor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(trnLbl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(donorLbl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel2)))
                        .addGap(0, 550, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdateDonor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteTrn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDonate))
                            .addComponent(btnUpdateDonor, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(donorLbl)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDonor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trnLbl)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteTrn)
                    .addComponent(btnDonate)
                    .addComponent(btnUpdateDonor1))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void donorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donorTableMouseClicked
//        // TODO add your handling code here:
//        System.out.println("Table row clicked");
//        DefaultTableModel model = (DefaultTableModel) donorTrnTable.getModel();
//
//        JTable target = (JTable) evt.getSource();
//        int row = target.getSelectedRow(); // select a row
//        Person person = (Person) donorTable.getValueAt(row, 0);
//        List<DonorTransaction> transaction = person.getDonorTransaction();
//        model.setRowCount(0);
//        String bloodGroup = person.getBloodGroup();
//        for (DonorTransaction data : transaction) {
//            Object[] rowTrn = new Object[10];
//            //row[0] = ++index;
//
//            rowTrn[0] = data;
//            rowTrn[1] = data.getAge();
//            rowTrn[2] = data.getWeight();
//            rowTrn[3] = data.getHeight();
//            rowTrn[4] = data.getHblevel();
//            rowTrn[5] = data.getBloodLastDonatedDate();
//            rowTrn[6] = data.getBloodDonationDate();
//            rowTrn[7] = data.getNumberOfUnits();
//            rowTrn[8] = data.isOtherDiseases();
//            rowTrn[9] = data.getPrice();
//
//            model.addRow(rowTrn);
//        }
    }//GEN-LAST:event_donorTableMouseClicked

    private void btnUpdateDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDonorActionPerformed
        // TODO add your handling code here:
        //System.out.println("ui.ViewPatients.patientUpdBtnActionPerformed()");
        DefaultTableModel model = (DefaultTableModel) donorTable.getModel();
        int rowIndex = donorTable.getSelectedRow();
        int colIndex = 0;
        int colIndex1 = donorTable.getSelectedColumn();

        Vector dataVector = model.getDataVector();
        Vector elementAt = (Vector) dataVector.elementAt(rowIndex);
   
        Person person = (Person) model.getValueAt(rowIndex, colIndex);
        if (!elementAt.get(1).toString().isEmpty() && !elementAt.get(2).toString().isEmpty() && !elementAt.get(3).toString().isEmpty()
                && !elementAt.get(4).toString().isEmpty() && !elementAt.get(5).toString().isEmpty()) {

            try {
                    person.setId(Integer.parseInt(elementAt.get(1).toString()));
                    person.setName(elementAt.get(2).toString());
                    person.setEmail(elementAt.get(3).toString());
                    person.setPhoneNum(Long.parseLong(elementAt.get(4).toString()));
                    person.setBloodGroup(elementAt.get(4).toString());

                    JOptionPane.showMessageDialog(this, "Value updated successfully!");

                
            } catch (NumberFormatException | NullPointerException exception) {

                JOptionPane.showMessageDialog(this, "Please enter all values.");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter all values.");
        }

    }//GEN-LAST:event_btnUpdateDonorActionPerformed

    private void btnDeleteTrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTrnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = donorTrnTable.getSelectedRow();
        long phoneNum = this.userAccount.getUser().getPhoneNum();
        
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel modelTrn = (DefaultTableModel) donorTrnTable.getModel();
        DonateBloodWorkRequest person = (DonateBloodWorkRequest) modelTrn.getValueAt(selectedRowIndex, 0);
        DonorTransaction donorTransaction = person.getDonorTransaction();
        //DonorTransaction donorTransaction = (DonorTransaction) modelTrn.getValueAt(selectedRowIndex, 0);
        for (Network n : this.business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof BloodBankEnterprise) {
                    for (Organizations org : e.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof BloodBankOrganization) {
                            DefaultTableModel modelR = (DefaultTableModel) donorTrnTable.getModel();
                            modelR.setRowCount(0);
                            org.getWorkQueue().getWorkRequestList().remove(person);
                        }
                    }
                }
                if (e instanceof PopulationEnterprise) {
                    for (Organizations org : e.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof PersonOrganization) {
                            DefaultTableModel modelR = (DefaultTableModel) donorTrnTable.getModel();
                            modelR.setRowCount(0);
                           PersonOrganization p = (PersonOrganization) org;
                           p.getPersonDirectory().getPersonByPhoneNum(phoneNum).removeDonorTransaction(donorTransaction);
                        }
                    }
                }
            }
        }
        viewDonationHist();
        //person.removeDonorTransaction(donorTransaction);
       // modelTrn.removeRow(selectedRowIndex);
        JOptionPane.showMessageDialog(this, "Donor Transaction deleted");
    }//GEN-LAST:event_btnDeleteTrnActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = donorTrnTable.getSelectedRow();

        // Selected patient
        DefaultTableModel model = (DefaultTableModel) donorTrnTable.getModel();
        DonateBloodWorkRequest wr = (DonateBloodWorkRequest) model.getValueAt(selectedRowIndex, 0);
        if (wr.getStatus() == "Approved") {
            wr.setStatus("Complete");
            viewDonationHist();
            JOptionPane.showMessageDialog(this, "Donor Transaction completed");
        }
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnUpdateDonor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDonor1ActionPerformed
        // TODO add your handling code here:
                int selectedRowIndex = donorTrnTable.getSelectedRow();
        DefaultTableModel modelTrn = (DefaultTableModel) donorTrnTable.getModel();
        DonateBloodWorkRequest person = (DonateBloodWorkRequest) modelTrn.getValueAt(selectedRowIndex, 0);
        Vector dataVector = modelTrn.getDataVector();
        Vector elementAt = (Vector) dataVector.elementAt(selectedRowIndex);
        if (!elementAt.get(2).toString().isEmpty() && !elementAt.get(3).toString().isEmpty() && !elementAt.get(4).toString().isEmpty()
                && !elementAt.get(5).toString().isEmpty() && !elementAt.get(6).toString().isEmpty() && !elementAt.get(7).toString().isEmpty() && !elementAt.get(8).toString().isEmpty()) {

            try {
                    person.getDonorTransaction().setWeight(Float.parseFloat(elementAt.get(2).toString()));
                    person.getDonorTransaction().setHeight(Float.parseFloat(elementAt.get(3).toString()));
                    person.getDonorTransaction().setHblevel(Float.parseFloat(elementAt.get(4).toString()));
                    person.getDonorTransaction().setOtherDiseases(Boolean.parseBoolean(elementAt.get(8).toString()));
                    person.getDonorTransaction().setNumberOfUnits(Integer.parseInt(elementAt.get(7).toString()));

                    JOptionPane.showMessageDialog(this, "Value updated successfully!");

                
            } catch (NumberFormatException | NullPointerException exception) {

                JOptionPane.showMessageDialog(this, "Please enter all values.");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter all values.");
        }
        
        
    }//GEN-LAST:event_btnUpdateDonor1ActionPerformed
    /**
     * *
     **
     */
    private void viewDonationHist() {
        DefaultTableModel model = (DefaultTableModel) donorTable.getModel();
        model.setRowCount(0);

        Person person = (Person) this.userAccount.getUser();
        Object[] row = new Object[6];
        row[0] = person;
        row[1] = person.getId();
        row[2] = person.getName();
        row[3] = person.getEmail();
        row[4] = person.getPhoneNum();
        row[5] = person.getBloodGroup();

        model.addRow(row);

        for (Network n : this.business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof BloodBankEnterprise) {
                    for (Organizations org : e.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof BloodBankOrganization) {
                            DefaultTableModel modelR = (DefaultTableModel) donorTrnTable.getModel();
                            modelR.setRowCount(0);
                            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                                if (request instanceof DonateBloodWorkRequest && ((DonateBloodWorkRequest) request).getPerson().getName().equals(person.getName())) {

                                    Object[] rowTrn = new Object[12];
                                    //row[0] = ++index;
                                    int price = ((DonateBloodWorkRequest) request).getDonorTransaction().getNumberOfUnits() * 300;
                                    rowTrn[0] = request;
                                    rowTrn[1] = ((DonateBloodWorkRequest) request).getDonorTransaction().getAge();
                                    rowTrn[2] = ((DonateBloodWorkRequest) request).getDonorTransaction().getWeight();
                                    rowTrn[3] = ((DonateBloodWorkRequest) request).getDonorTransaction().getHeight();
                                    rowTrn[4] = ((DonateBloodWorkRequest) request).getDonorTransaction().getHblevel();
                                    rowTrn[5] = ((DonateBloodWorkRequest) request).getDonorTransaction().getBloodLastDonatedDate();
                                    rowTrn[6] = ((DonateBloodWorkRequest) request).getDonorTransaction().getBloodDonationDate();
                                    rowTrn[7] = ((DonateBloodWorkRequest) request).getDonorTransaction().getNumberOfUnits();
                                    rowTrn[8] = ((DonateBloodWorkRequest) request).getDonorTransaction().isOtherDiseases();
                                    rowTrn[9] = price;
                                    rowTrn[10] = request.getRequestDate();
                                    rowTrn[11] = request.getStatus();
                                    modelR.addRow(rowTrn);
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTrn;
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnUpdateDonor;
    private javax.swing.JButton btnUpdateDonor1;
    private javax.swing.JLabel donorLbl;
    private javax.swing.JTable donorTable;
    private javax.swing.JTable donorTrnTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel trnLbl;
    // End of variables declaration//GEN-END:variables
}