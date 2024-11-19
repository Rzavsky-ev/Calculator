package pro.sky.Calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Calculator.servise.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {

        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String answerHello() {
        return calculatorService.answerHello();
    }

    @GetMapping(path = "/plus")
    public String answerPlus(@RequestParam(required = false) Integer num1,
                             @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка ввода";
        }
        return num1 + "+" + num2 + "=" + calculatorService.answerPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String answerMinus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка ввода";
        }
        return num1 + "-" + num2 + "=" + calculatorService.answerMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String answerMultiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка ввода";
        }
        return num1 + "*" + num2 + "=" + calculatorService.answerMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String answerDivide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка ввода";
        } else if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        return num1 + "/" + num2 + "=" + calculatorService.answerDivide(num1, num2);
    }
}

