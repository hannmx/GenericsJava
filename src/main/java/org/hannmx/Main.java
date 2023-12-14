package org.hannmx;

public class Main {
    public static void main(String[] args) {
        // Использование класса Calculator
        double resultSum = Calculator.sum(5, 3.2);
        System.out.println("Sum: " + resultSum);

        double resultMultiply = Calculator.multiply(2.5, 4);
        System.out.println("Multiply: " + resultMultiply);

        double resultDivide = Calculator.divide(10, 2);
        System.out.println("Divide: " + resultDivide);

        double resultSubtract = Calculator.subtract(8, 3);
        System.out.println("Subtract: " + resultSubtract);

        // Использование класса ArrayComparator
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        boolean arraysEqual = ArrayComparator.compareArrays(array1, array2);
        System.out.println("Arrays are equal: " + arraysEqual);

        // Использование класса Pair
        Pair<String, Integer> pair = new Pair<>("Hello", 5);
        System.out.println("First element of pair: " + pair.getFirst());
        System.out.println("Second element of pair: " + pair.getSecond());
        System.out.println("Pair: " + pair);
    }
}
