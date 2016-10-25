/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calcArrayIntegers.calcArrayIntegers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manuel.molinamarin
 */
public class calcArrayIntegersTest {
    
    public calcArrayIntegersTest() {
    }
    
    @Test
    public void calcMaximumTest() {
        calcArrayIntegers calcIntTest = new calcArrayIntegers();
        calcIntTest.addNumber(100);
        calcIntTest.addNumber(10);
        calcIntTest.addNumber(1000);
        
        assertEquals(calcIntTest.calcMaximum(), 1000);
    }
    
    @Test
    public void calcMinimumTest() {
        calcArrayIntegers calcIntTest = new calcArrayIntegers();
        calcIntTest.addNumber(100);
        calcIntTest.addNumber(10);
        calcIntTest.addNumber(1000);
        
        assertEquals(calcIntTest.calcMinimum(), 10);
    }
            
    @Test
    public void calcAverageTest() {
        calcArrayIntegers calcIntTest = new calcArrayIntegers();
        calcIntTest.addNumber(100);
        calcIntTest.addNumber(10);
        calcIntTest.addNumber(1000);
        
        assertEquals(calcIntTest.calcAverage(), 370);
    }
    
    @Test
    public void addNumberTest() {        
        calcArrayIntegers calcIntTest = new calcArrayIntegers();
        int firstSize = calcIntTest.returnSize();
        calcIntTest.addNumber(100);
        int secondtSize = calcIntTest.returnSize();
        
        assertEquals(firstSize+1, secondtSize);
    }
    
    @Test
    public void returnSizeTest() {        
        calcArrayIntegers calcIntTest = new calcArrayIntegers();
        calcIntTest.addNumber(100);
        calcIntTest.addNumber(10);
        int firstSize = calcIntTest.returnSize();
        assertEquals(firstSize, 2);
    }
}
