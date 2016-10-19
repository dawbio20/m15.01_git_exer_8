/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15.pkg01_git_exer_8;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author manuel.molinamarin
 */
public class App {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultNumbers;        
        boolean resultIsNum = false;
        String totNumbers = "";
        int typeOperation;
        
        System.out.println("Starting the application");
        while (resultIsNum == false) {

            System.out.println("Type how many numbers would you "
                    + "like calculate or 'exit' to close the application:");

            Scanner inKeyboard = new Scanner(System.in);
            totNumbers = inKeyboard.nextLine();
        
            if (totNumbers == "exit") {
                resultIsNum = true;
            } else if (!totNumbers.trim().isEmpty() && isNumeric(totNumbers)) {
                resultNumbers = askForNumbers(Integer.parseInt(totNumbers));
                askForOperation();
                resultIsNum = true;
            } else {
                System.out.println("Error - Number incorrect. Try again");
            }
        }
        
        
        System.out.println("Finishing the application");
        
    }
    
    private static int askForNumbers(int nums) {
        String addNumber;
        int resultNumbers = 0;
        
        for (int i = 0; i < nums; i++) {
            System.out.println("Type the number to calculate:");
            //Ask for a company name
            Scanner inKeyboard = new Scanner(System.in);
            addNumber = inKeyboard.nextLine();
            if (!addNumber.trim().isEmpty() && isNumeric(addNumber)) {
                resultNumbers += Integer.parseInt(addNumber);
            } else {
                System.out.println("Error - Number incorrect. Try again.");
            }            
        }
        return resultNumbers;
    }
    
    private static int askForOperation() {
        
        return 0;
    }
        
    /**
     * Evaluate if a string is numeric
     * @param str String
     * @return boolean True if the string is numeric, false otherwise
     */
    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
}
