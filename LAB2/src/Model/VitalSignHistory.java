/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author grace
 */
public class VitalSignHistory {
    
   private ArrayList<VitalSign> history;

    // Constructor
    public VitalSignHistory() {
        this.history = new ArrayList<>();
    }

    // Getter for the history list
    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    // Setter for the history list
    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }

    // Add a new VitalSign to the history
    public VitalSign addNewVital() {
        VitalSign newVital = new VitalSign();
        history.add(newVital);
        return newVital;
    }

    // Delete a VitalSign from the history
    public void deleteVital(VitalSign vs) {
        history.remove(vs);
    }
    
}
