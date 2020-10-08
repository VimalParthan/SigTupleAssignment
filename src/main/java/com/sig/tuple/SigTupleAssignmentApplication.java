package com.sig.tuple;

import java.util.Scanner;

public class SigTupleAssignmentApplication {


    public static void main (String [] args){
        boolean validInput = false;
        while(!validInput) {
            System.out.println("Please enter '1' for Max Product of K number of an array solver");
            System.out.println("Please enter '2' for Next Greater Element of an array solver");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            ProblemSolverFactory problemSolverFactory = new ProblemSolverFactory();
            ProblemSolver problemSolver = null;
            try {
                problemSolver = problemSolverFactory.getProblemSolver(input);
            }catch (IllegalArgumentException e){
                continue;
            }
            problemSolver.parseInput(scanner);
            String [] outputStringArray = problemSolver.solve();
            for(String outputString: outputStringArray){
                System.out.println(outputString);
            }
            validInput = true;
        }
    }
}
