package br.dev.ely.converters;

import br.dev.ely.exceotion.unsupportedMathOperationException;

public class numberConverter {

    public static Double convertoToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) throw new unsupportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
