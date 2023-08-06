package ru.skypro.calculator.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.calculator.exception.ZeroDivideException;
import ru.skypro.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String sayHallo() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int getDivide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ZeroDivideException("На ноль делить нельзя");
        }
    }
}
