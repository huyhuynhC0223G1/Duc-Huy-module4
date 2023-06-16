package com.example.caculator.service.impl;

import com.example.caculator.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public String resultCaculator(double number1, double number2, String calculate) {
        String result = null;
        double a = 0;
        if (number1 == 0 || number2 == 0) {
            result = "you must enter the full number";
        } else {
            switch (calculate) {
                case "+":
                    a = number1 + number2;
                    result = Double.toString(a);
                    break;
                case "-":
                    a = number1 - number2;
                    result = Double.toString(a);
                    break;
                case "*":
                    a = number1 * number2;
                    result = Double.toString(a);
                    break;
                case "/":
                    if (number2 == 0) {
                        result = "not divided by 0";
                    } else {
                        a = number1 / number2;
                        result = Double.toString(a);
                    }
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}
