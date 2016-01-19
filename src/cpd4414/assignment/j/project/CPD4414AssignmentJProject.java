/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment.j.project;

/**
 *
 * @author c0648185
 */
public class CPD4414AssignmentJProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static String stringPower(String string, int power) {

        if (power < 1) {
            return null;
        } else if (power == 1 && !string.equals("")) {
            return string;
        } else if (power == 2 && !string.equals("")) {
            return string + string;
        } else if(power > 2 && !string.equals("")){
            
        StringBuilder builder = new StringBuilder();
            for (int i = 0; i < power; i++) {
            builder.append(string);
            
            }
            return builder.toString();
            
        }else {
            return "";
        }
        
    }
}
