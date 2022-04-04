package br.com.whiz.foo.exception.math;

import br.com.whiz.foo.exception.UnsupportedMathOperationException;
import br.com.whiz.foo.converters.MathConvert;

public class MathException {

    public static void notNumeric(String numberOne, String numberTwo) {
        if (!MathConvert.isNumeric(numberOne) || !MathConvert.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
    }

    public static void notNumeric(String number) {
        if (!MathConvert.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
    }
}
