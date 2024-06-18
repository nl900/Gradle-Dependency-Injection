package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculatorRunner implements CommandLineRunner {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorRunner(CalculatorService calculator) {
        this.calculatorService = calculator;
    }

    @Override
    public void run(String... args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + a + " + " + b + " = " + calculatorService.add(a, b));

    }
}
