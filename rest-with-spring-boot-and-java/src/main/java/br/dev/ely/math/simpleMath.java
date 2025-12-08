package br.dev.ely.math;

import br.dev.ely.exceotion.unsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class simpleMath {

    public Double sum (Double numberOne,Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double subtraction (Double numberOne,Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double multiplication (Double numberOne,Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double division (Double numberOne,Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double mean (Double numberOne,Double numberTwo) {
        return numberOne + numberTwo / 2;
    }

    public Double squareRoot (Double number) {
        return Math.sqrt(number);
    }
}