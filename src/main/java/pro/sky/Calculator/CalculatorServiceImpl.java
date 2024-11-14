package pro.sky.Calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String answerHello() {
        return "Добро пожаловать в калькулятор.";
    }

    @Override
    public Integer answerPlus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer answerMinus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer answerMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer answerDivide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}

