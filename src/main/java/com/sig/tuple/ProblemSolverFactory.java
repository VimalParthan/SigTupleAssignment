package com.sig.tuple;

public class ProblemSolverFactory {

    public ProblemSolver getProblemSolver(String input)throws IllegalArgumentException{

        if(input.trim().equals(ProblemSolverEnum.MAX_PRODUCT_SOLVER.value)){
            return new MaxProductSolver();
        }else if(input.trim().equals(ProblemSolverEnum.NEXT_GREATER_ELEMENT_SOLVER.value)){
            return new NextGreaterElementSolver();
        }else{
            throw new IllegalArgumentException("Invalid Input");
        }

    }

}
