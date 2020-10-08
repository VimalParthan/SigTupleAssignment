package com.sig.tuple;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductSolver extends ProblemSolver{

    private int k;

    private int [] intArray;

    private int [] maxProductSubset;

    public void parseInput(Scanner scanner) {
        System.out.println("Please enter the integers of the array separated by space (eg: 1,2)");
        String arrayString = scanner.next();
        String []  intStringArray = arrayString.split(",");
        this.intArray = new int [intStringArray.length];
        for (int i=0;i<intArray.length;i++){
            intArray[i]= Integer.parseInt(intStringArray[i].trim());
        }
        System.out.println("Please enter an Integer representing K:");
        this.k = Integer.parseInt(scanner.next());

    }

    public String [] solve() {

        Arrays.sort(this.intArray);

        int maxProduct = 1;
        int arrayLength = this.intArray.length;

        if (maxIntIsZeroAndKIsOdd(intArray,k)) {
            return getOutputStringArray(0);
        }

        if (maxIntIsLessThanOrEqualToZeroAndKisOdd(intArray,k)) {
            for (int i = arrayLength - 1; i >= arrayLength - k; i--){
                maxProduct *= intArray[i];
            }
            return getOutputStringArray(maxProduct);
        }

        int leftIndex = 0;
        int rightIndex = arrayLength - 1;

        if (k % 2 != 0) {
            maxProduct *= intArray[rightIndex];
            rightIndex--;
            k--;
        }

        int numberOfIterations = k/2;

        for (int i = 0; i < numberOfIterations; i++) {
            int leftProduct = intArray[leftIndex] * intArray[leftIndex + 1];
            int rightProduct = intArray[rightIndex] * intArray[rightIndex - 1];

            if (leftProduct > rightProduct) {
                maxProduct *= leftProduct;
                leftIndex += 2;
            }
            else {
                maxProduct *= rightProduct;
                rightIndex -= 2;
            }
        }

        return getOutputStringArray(maxProduct);
    }

    private String [] getOutputStringArray(int maxProduct){
        String [] outputStringArray = new String[1];
        outputStringArray[0] = String.valueOf(maxProduct);
        return outputStringArray;
    }

    private boolean maxIntIsZeroAndKIsOdd(int[] intArray, int k){
        return intArray[intArray.length - 1] == 0 && k % 2 != 0;
    }

    private boolean maxIntIsLessThanOrEqualToZeroAndKisOdd(int[] intArray, int k){
        return intArray[intArray.length - 1] <= 0 && k % 2 != 0;
    }

}
