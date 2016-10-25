/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcArrayIntegers;

import java.util.ArrayList;
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
        
        calcArrayIntegers myCalcInt = new calcArrayIntegers();
                
        int resultNumbers;        
        boolean totNumbersIsNum = false;
        boolean resultIsNum = false;
        String totNumbers = "";
        int typeOperation;
        Scanner inKeyboard = new Scanner(System.in);
        
        System.out.println("Starting the application");
        while (totNumbersIsNum == false) {

            System.out.println("Type how many numbers would you "
                    + "like calculate or 'exit' to close the application:");
            
            totNumbers = inKeyboard.nextLine();
        
            if ("exit".equals(totNumbers)) {
                totNumbersIsNum = true;
            } else if (isNumeric(totNumbers)) {
                String newNumber;
                
                //for (int i = 0; i < Integer.parseInt(totNumbers); i++) {
                while (myCalcInt.returnSize() < Integer.parseInt(totNumbers)) {
                    System.out.println("Type a number to calculate:");

                    inKeyboard = new Scanner(System.in);
                    newNumber = inKeyboard.nextLine();
                    if (isNumeric(newNumber)) {
                        myCalcInt.addNumber(Integer.parseInt(newNumber));
                    } else {
                        System.out.println("Error - Number incorrect. Try again.");
                    }            
                }   
                totNumbersIsNum = true;
            } else {
                System.out.println("Error - Number incorrect. Try again");
            }
        }
            
        /**
        * 1 => average
        * 2 => maxim
        * 3 => minim
        */
        String operation;
        int result = 0;

        while (!resultIsNum && totNumbersIsNum) {
            System.out.println("Type the operation.");
            System.out.println("1 -> Average");
            System.out.println("2 -> Maximum");
            System.out.println("3 -> Minimum");

            inKeyboard = new Scanner(System.in);
            operation = inKeyboard.nextLine();
            if (isNumeric(operation)) {
                switch (operation) {
                    case "1":
                        result = myCalcInt.calcAverage();
                        resultIsNum = true;
                        break;
                    case "2":
                        result = myCalcInt.calcMaximum();
                        resultIsNum = true;
                        break;
                    case "3":
                        result = myCalcInt.calcMinimum();
                        resultIsNum = true;
                        break;
                    default:
                        System.out.println("Selection incorrect. Try again.");
                }               
            } else {
                System.out.println("Error - Number incorrect. Try again.");
            }
            if (resultIsNum) {
                System.out.println( "Result: "+result);
            }
        }
                
        System.out.println("Finishing the application");        
    }
    
    public static boolean isNumeric(String str) {
        
            boolean result = true;
            if (str.trim().isEmpty()) {
                result = false;
            } else {
                for (char c : str.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        result = false;
                    }
                }
            }
            return result;
        }

}
