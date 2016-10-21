/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15.pkg01_git_exer_8;

import java.util.ArrayList;
import java.util.Scanner;
import static m15.pkg01_git_exer_8.functions.isNumeric;

/**
 *
 * @author manuel.molinamarin
 */
public class exer_8_git_calcArrayIntegers {

    private ArrayList<Integer> arrayInt;

    public ArrayList<Integer> getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(ArrayList<Integer> arrayInt) {
        this.arrayInt = arrayInt;
    }
        
    private void askForNumbers(int nums) {
        String addNumber;       
        
        for (int i = 0; i < nums; i++) {
            System.out.println("Type the number to calculate:");
            
            Scanner inKeyboard = new Scanner(System.in);
            addNumber = inKeyboard.nextLine();
            if (!addNumber.trim().isEmpty() && isNumeric(addNumber)) {
                this.arrayInt.add(Integer.parseInt(addNumber));
            } else {
                System.out.println("Error - Number incorrect. Try again.");
            }            
        }
    }
    
    private int askForOperation() {
        /**
        * 1 => average
        * 2 => maxim
        * 3 => minim
        */
        boolean resultIsNum = false;
        String operation;
        functions generalFunc = new functions();
        
        while (resultIsNum == false) {
            System.out.println("Type the operation.");
            System.out.println("1 -> Average");
            System.out.println("2 -> Maximum");
            System.out.println("3 -> Minimum");
            
            Scanner inKeyboard = new Scanner(System.in);
            operation = inKeyboard.nextLine();
            if (!operation.trim().isEmpty() && isNumeric(operation)) {
                switch (Integer.parseInt(operation)) {
                    case 1:
                    
                    case 2:
                        
                    case 3:
                    
                    default:
                        System.out.println("Selection incorrecto. Try again.");
                }
            } else {
                System.out.println("Error - Number incorrect. Try again.");
            }
        }
        
        return 0;
    }
    
    private static int calcAverage() {
        return 0;
    }    
        
    
    
}
