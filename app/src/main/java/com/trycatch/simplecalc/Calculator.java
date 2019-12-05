package com.trycatch.simplecalc;

/**
 * Utility class for SimpleCalc to perform the actual calculations.
 */
class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL}

    /**
     * Addition operation
     */
    double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}
