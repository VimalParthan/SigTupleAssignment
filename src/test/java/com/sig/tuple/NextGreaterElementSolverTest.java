package com.sig.tuple;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class NextGreaterElementSolverTest {

    private  NextGreaterElementSolver nextGreaterElementSolver;

    @Before
    public void init(){
        nextGreaterElementSolver = new NextGreaterElementSolver();
    }

    @Test
    public void testOne() {
        String input = "12,15,23,26,67,24\n";
        String [] outputStringArray = getSolverOutput(input);
        assertEquals("12 --> 15", outputStringArray[0]);
        assertEquals("15 --> 23", outputStringArray[1]);
        assertEquals("23 --> 26", outputStringArray[2]);
        assertEquals("26 --> 67", outputStringArray[3]);
        assertEquals("24 --> -1", outputStringArray[4]);
        assertEquals("67 --> -1", outputStringArray[5]);
    }

    @Test
    public void testTwo() {
        String input = "13,7,6,12\n";
        String [] outputStringArray = getSolverOutput(input);
        assertEquals("6 --> 12", outputStringArray[0]);
        assertEquals("7 --> 12", outputStringArray[1]);
        assertEquals("12 --> -1", outputStringArray[2]);
        assertEquals("13 --> -1", outputStringArray[3]);
    }

    private String [] getSolverOutput(String input){
        this.nextGreaterElementSolver.parseInput(new Scanner(input));
        return this.nextGreaterElementSolver.solve();
    }
}
