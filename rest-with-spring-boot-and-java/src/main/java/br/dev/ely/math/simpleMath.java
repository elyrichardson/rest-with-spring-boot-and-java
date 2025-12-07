package br.dev.ely.math;

import br.dev.ely.exceotion.unsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class simpleMath {

    public Double sum (String numberOne,String numberTwo)
        return numberOne + numberTwo;
    }

    public Double subtraction (String numberOne,String numberTwo)
        return numberOne - numberTwo;
    }

    public Double multiplication (String numberOne,String numberTwo)
        return numberOne * numberTwo;
    }

    public Double division (String numberOne,String numberTwo)
        return numberOne / numberTwo;
    }

    public Double mean (String numberOne,String numberTwo)
        return numberOne + numberTwo / 2;
    }

    public Double squareRoot (String numberOne,String numberTwo)
        return Math.sqrt(numberOne);
    }
}