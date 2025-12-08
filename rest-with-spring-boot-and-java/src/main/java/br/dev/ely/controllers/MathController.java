package br.dev.ely.controllers;
package br.dev.ely.math;

import br.dev.ely.exceotion.unsupportedMathOperationException;
import br.dev.ely.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    // http://localhost:8080/math/sum/2/2
    @RequestMapping ("/sum/{numberOne}/{numberTwo}")
    public Double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return math.sum(NumberConverter.convertoToDouble(numberOne), NumberConverter.convertoToDouble(numberTwo));
    }

    //http://localhost:8080/math/subtraction/3/5
    @RequestMapping ("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return math.subtraction(NumberConverter.convertoToDouble(numberOne), NumberConverter.convertoToDouble(numberTwo));
    }

    //http://localhost:8080/math/multiplication/3/5
    @RequestMapping ("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return math.multiplication(NumberConverter.convertoToDouble(numberOne), NumberConverter.convertoToDouble(numberTwo));
    }

    //http://localhost:8080/math/division/3/5
    @RequestMapping ("/division/{numberOne}/{numberTwo}")
    public Double division (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return math.division(NumberConverter.convertoToDouble(numberOne) / NumberConverter.convertoToDouble(numberTwo));
    }

    //http://localhost:8080/math/mean/3/5
    @RequestMapping ("/mean/{numberOne}/{numberTwo}")
    public Double mean (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return math.mean(NumberConverter.convertoToDouble(numberOne), NumberConverter.convertoToDouble(numberTwo));
    }

    //http://localhost:8080/math/squareRoot/3/5
    @RequestMapping ("/squareRoot/{number}")
    public Double squareRoot (
            @PathVariable("number") String number
    )throws Exception {
        if(!NumberConverter.isNumeric(number)) throw new unsupportedMathOperationException("Please set a numeric value!");
        return math.squareRoot(NumberConverter.convertoToDouble(number));
    }

}
