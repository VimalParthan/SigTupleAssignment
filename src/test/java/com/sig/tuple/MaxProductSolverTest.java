package com.sig.tuple;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class MaxProductSolverTest {

    private  MaxProductSolver maxProductSolver;

    @Before
    public void init(){
        maxProductSolver = new MaxProductSolver();
    }

    @Test
    public void testWithPositiveIntegers() {
        String input = "12,15,23,26,67,24\n2\n";
        String [] outputStringArray = getSolverOutput(input);
        assertEquals("1742", outputStringArray[0]);
    }

    @Test
    public void testWithNegativeIntegersAndOddKValue() {
        String input = "-12,-15,-23,-26,-67,-24\n3\n";
        String [] outputStringArray = getSolverOutput(input);
        assertEquals("-4140", outputStringArray[0]);
    }

    @Test
    public void testWithPositiveAndNegativeIntegersAndOddKValue() {
        String input = "-12,-15,23,-26,-67,24\n3\n";
        String [] outputStringArray = getSolverOutput(input);
        assertEquals("41808", outputStringArray[0]);
    }

    private String [] getSolverOutput(String input){
        this.maxProductSolver.parseInput(new Scanner(input));
        return this.maxProductSolver.solve();
    }

}
