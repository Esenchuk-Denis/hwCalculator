package com.calculator.hwcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор<b/>";
    }

    public String check(Integer num1, Integer num2) {
        if (num1 == null || num2 == null ) {
            return "<b> Не все значения заданы <b/>";
        }
        return "все значения заданы";
    }

    public String plus(int num1, int num2) {
        int total = num1 + num2;
        return num1+" + "+num2+" = "+total;
    }

    public String minus(int num1, int num2) {
        int total = num1 - num2;
        return num1+" - "+num2+" = "+total;
    }

    public String multiply(int num1, int num2) {
        int total = num1 * num2;
        return num1 + " * " + num2 + " = " + total;
    }

    public String divide(double num1, double num2) {
        double total = num1 / num2;
        if (num2 == 0) {
            return  "<b>Делитель не может быть равен 0<b/>";
        } else{
            return num1 + " / " + num2 + " = " + total;
        }

    }

}
