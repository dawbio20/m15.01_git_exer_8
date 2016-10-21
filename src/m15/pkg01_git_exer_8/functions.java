/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15.pkg01_git_exer_8;

/**
 *
 * @author manuel.molinamarin
 */
public class functions {
    
    /**
     * Evaluate if a string is numeric
     * @param str String
     * @return boolean True if the string is numeric, false otherwise
     */
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
