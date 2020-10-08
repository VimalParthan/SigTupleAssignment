package com.sig.tuple;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementSolver extends ProblemSolver{

    private int [] intArray;

    public void parseInput(Scanner scanner) {
        System.out.println("Please enter the integers of the array separated by space (eg: 1,2)");
        String arrayString = scanner.next();
        String []  intStringArray = arrayString.split(",");
        this.intArray = new int [intStringArray.length];

        for (int i=0;i<intArray.length;i++){
            intArray[i]= Integer.parseInt(intStringArray[i].trim());
        }
    }

    public String [] solve() {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(this.intArray[0]);
        String [] outputStringArray = new String[this.intArray.length];
        int outputIndex = 0;

        for (int i = 1; i < this.intArray.length; i++) {
            int currentElement = stack.peek();
            int nextElement = intArray[i];
            while (!stack.isEmpty() && currentElement < nextElement) {
                outputStringArray[outputIndex] = currentElement + " --> "  + nextElement;
                stack.pop();
                if(!stack.isEmpty()){
                    currentElement=stack.peek();
                }
                outputIndex++;
            }
            stack.push(nextElement);
        }
        while (!stack.isEmpty()) {
            int currentElement = stack.pop();
            outputStringArray[outputIndex] = currentElement + " --> "  + -1;
            outputIndex++;
        }

        return outputStringArray;
    }

}
