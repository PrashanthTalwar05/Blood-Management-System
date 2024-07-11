/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.TrainingDirectory;
import java.util.ArrayList;

/**
 *
 * @author saurabhgangal
 */
public class TrainingOrganization extends Organizations{
    private TrainingDirectory trainingDirectory;

    public TrainingDirectory getTrainingDirectory() {
        return trainingDirectory;
    }

    public void setTrainingDirectory(TrainingDirectory trainingDirectory) {
        this.trainingDirectory = trainingDirectory;
    }
    
    public TrainingOrganization(){
        super(Organizations.Type.Training.getValue());
        trainingDirectory = new TrainingDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
}
