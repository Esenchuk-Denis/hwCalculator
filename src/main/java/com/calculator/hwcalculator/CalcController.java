package com.calculator.hwcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(required = false) Integer num1,
                       @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return " Не все параметры были заданы";

        }

        return calcService.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return " Не все параметры были заданы";

        }
        return calcService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return " Не все параметры были заданы";

        }
        return calcService.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return " Не все параметры были заданы";

        }
        return calcService.divide(num1, num2);
    }
}
