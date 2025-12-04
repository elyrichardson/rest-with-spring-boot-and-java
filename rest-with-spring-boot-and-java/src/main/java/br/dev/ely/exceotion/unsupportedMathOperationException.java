package br.dev.ely.exceotion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class unsupportedMathOperationException extends RuntimeException {

    public unsupportedMathOperationException(String message) {

        super(message);
    }
}
