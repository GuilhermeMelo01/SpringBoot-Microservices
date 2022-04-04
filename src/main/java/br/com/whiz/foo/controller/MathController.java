package br.com.whiz.foo.controller;

import br.com.whiz.foo.exception.UnsupportedMathOperationException;
import br.com.whiz.foo.converters.MathConvert;
import br.com.whiz.foo.exception.math.MathException;
import br.com.whiz.foo.service.MathService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    MathService mathService = new MathService();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {

        MathException.notNumeric(numberOne, numberTwo);

        return mathService.sum(MathConvert.convertToDouble(numberOne), MathConvert.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsupportedMathOperationException {

        MathException.notNumeric(numberOne, numberTwo);

        return mathService.subtraction(MathConvert.convertToDouble(numberOne), MathConvert.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsupportedMathOperationException {

        MathException.notNumeric(numberOne, numberTwo);

        return mathService.multiplication(MathConvert.convertToDouble(numberOne), MathConvert.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsupportedMathOperationException {

        MathException.notNumeric(numberOne, numberTwo);

        return mathService.division(MathConvert.convertToDouble(numberOne), MathConvert.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsupportedMathOperationException {

        MathException.notNumeric(numberOne, numberTwo);

        return mathService.average(MathConvert.convertToDouble(numberOne), MathConvert.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable("number") String number) throws UnsupportedMathOperationException {

        MathException.notNumeric(number);

        return mathService.squareRoot(MathConvert.convertToDouble(number));
    }


}
