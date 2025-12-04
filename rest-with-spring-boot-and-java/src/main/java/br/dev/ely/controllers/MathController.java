package br.dev.ely.controllers;

import br.dev.ely.exceotion.unsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/math")
public class MathController {

    // http://localhost:8080/match/sum/2/2
    @RequestMapping ("/sum/{numberOne}/{numberTwo}")
    public Double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return convertoToDouble(numberOne) + convertoToDouble(numberTwo);
    }

    //http://localhost:8080/match/subtraction/3/5
    @RequestMapping ("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return convertoToDouble(numberOne) - convertoToDouble(numberTwo);
    }

    private Double convertoToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) throw new unsupportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
