package Calculator;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                assert Integer.MAX_VALUE - Math.abs(firstOperand) >= Math.abs(secondOperand): "Выход за пределы диапазона int";
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }


    // В классе Calculator создайте метод calculatingDiscount, который принимает сумму покупки и процент скидки и 
    // возвращает сумму с учетом скидки.
    // Проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount 
    // получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (purchaseAmount <= 0)
            throw new ArithmeticException("Сумма покупки до применения скидки не может быть меньше или равной нулю.");
        if (discountAmount < 0 || discountAmount > 100)
            throw new ArithmeticException("Размер скидки должен быть в диапазоне 0-100%");
        return purchaseAmount - (purchaseAmount * discountAmount / 100); // Метод должен возвращать сумму покупки со скидкой
    }
}