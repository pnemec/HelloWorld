package com.pnemec;

public class TestAverage {
    public static void main(String[] args) {
        // define list of numbers
        int[] numbers = {10, 20, 30};

        // create new object of type Average
        Average avgObj = new Average();

        // call computeAverage on the avgObj object.
        int avg = avgObj.computeAverage(numbers);

        System.out.println("Average of " + printArray(numbers) +" is : "+ avg);
        System.out.println(numbers.toString());
    }

    private static String printArray(int[] numbers) {
        StringBuilder out = new StringBuilder();
        int numCount = numbers.length;
        int i = 0;

        out.append("[");
        while (i < numCount) {
            out.append(numbers[i]);
            out.append(" ");
            i++;
        }
        out.append("]");

        return out.toString();
    }
}
