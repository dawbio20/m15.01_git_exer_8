/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15.pkg01_git_exer_8;

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
        
        /**
        * 
        */        
        exer_8_git_calcArrayIntegers myCalcInt = new exer_8_git_calcArrayIntegers();
        functions generalFunc = new functions();
        
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
        
            if ("exit".equals(totNumbers)) {
                resultIsNum = true;
            } else if (!totNumbers.trim().isEmpty() && generalFunc.isNumeric(totNumbers)) {
                myCalcInt.askForNumbers(Integer.parseInt(totNumbers));
                resultNumbers = myCalcInt.askForOperation();
                System.out.println("Result: "+resultNumbers);
            } else {
                System.out.println("Error - Number incorrect. Try again");
            }
        }
        
        System.out.println("Finishing the application");        
    }
    
}
