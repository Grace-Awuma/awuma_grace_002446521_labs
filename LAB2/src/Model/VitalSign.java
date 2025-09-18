/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author grace
 */
public class VitalSign {
       String date;
       float temperature;
       double bloodPressure;
       int pulse;
       boolean isConscious;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isIsConscious() {
        return isConscious;
    }

    public void setIsConscious(boolean isConscious) {
        this.isConscious = isConscious;
    }
       
       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
