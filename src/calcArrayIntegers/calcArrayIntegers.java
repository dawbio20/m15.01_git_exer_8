/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcArrayIntegers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Contains the information of the number list
 * @author Manu Molina
 */
public class calcArrayIntegers {

    private ArrayList<Integer> arrayInt = new ArrayList<>();

    public ArrayList<Integer> getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(ArrayList<Integer> arrayInt) {
        this.arrayInt = arrayInt;
    }
    
    /**
    * return the size of ArrayList
    * @param void
    * @return int size of ArrayList
    */
    public int returnSize() {
        return this.arrayInt.size();
    }
    
    /**
    * Add a number to ArrayList
    * @param int, number to add
    * @return void
    */
    public void addNumber(int num) {
        this.arrayInt.add(num);
    }
    
    /**
    * return the maximum value in ArrayList
    * @param void
    * @return int, the maximum value in ArrayList
    */
    public int calcMaximum() {
        int maxNum;
        maxNum = Collections.max(arrayInt);
        return maxNum;
    }
    
    /**
    * return the minimum value in ArrayList
    * @param void
    * @return int, the minimum value in ArrayList
    */
    public int calcMinimum() {
        int minNum;
        minNum = Collections.min(arrayInt);
        return minNum;
    }
    
    /**
    * return the average value of all numbers in ArrayList
    * @param void
    * @return int, the average value of ArrayList
    */
    public int calcAverage() {
        int avgNum;
        Integer tempNum = 0;
        for(int index = 0; index < arrayInt.size(); index++) {
            tempNum += arrayInt.get(index);
        }
        avgNum = tempNum / arrayInt.size();
        return avgNum;
    }
}
