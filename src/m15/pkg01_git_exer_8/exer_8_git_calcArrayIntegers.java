/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15.pkg01_git_exer_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static m15.pkg01_git_exer_8.functions.isNumeric;

/**
 *
 * @author manuel.molinamarin
 */
public class exer_8_git_calcArrayIntegers {

    private ArrayList<Integer> arrayInt = new ArrayList<>();

    public ArrayList<Integer> getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(ArrayList<Integer> arrayInt) {
        this.arrayInt = arrayInt;
    }
        
    public void askForNumbers(int nums) {
        String addNumber;       
        
        for (int i = 0; i < nums; i++) {
            System.out.println("Type a number to calculate:");
            
            Scanner inKeyboard = new Scanner(System.in);
            addNumber = inKeyboard.nextLine();
            if (!addNumber.trim().isEmpty() && isNumeric(addNumber)) {
                arrayInt.add(Integer.parseInt(addNumber));
            } else {
                System.out.println("Error - Number incorrect. Try again.");
            }            
        }
    }
    
    public int askForOperation() {
        /**
        * 1 => average
        * 2 => maxim
        * 3 => minim
        */
        boolean resultIsNum = false;
        String operation;
        int result = 0;
       
        while (resultIsNum == false) {
            System.out.println("Type the operation.");
            System.out.println("1 -> Average");
            System.out.println("2 -> Maximum");
            System.out.println("3 -> Minimum");
            
            Scanner inKeyboard = new Scanner(System.in);
            operation = inKeyboard.nextLine();
            if (!operation.trim().isEmpty() && isNumeric(operation)) {
                switch (operation) {
                    case "1":
                        result = calcAverage();
                        resultIsNum = true;
                        break;
                    case "2":
                        result = calcMaximum();
                        resultIsNum = true;
                        break;
                    case "3":
                        result = calcMinimum();
                        resultIsNum = true;
                        break;
                    default:
                        System.out.println("Selection incorrect. Try again.");
                }                
            } else {
                System.out.println("Error - Number incorrect. Try again.");
            }
        }
        
        return result;
    }
    
    private int calcMaximum() {
        int maxNum;
        maxNum = Collections.max(arrayInt);
        return maxNum;
    }
    
    private int calcMinimum() {
        int minNum;
        minNum = Collections.min(arrayInt);
        return minNum;
    }
    
    private int calcAverage() {
        int avgNum;
        Integer tempNum = 0;
        for(int index = 0; index < arrayInt.size(); index++) {
            tempNum += arrayInt.get(index);
        }
        avgNum = tempNum / arrayInt.size();
        return avgNum;
    }
}
