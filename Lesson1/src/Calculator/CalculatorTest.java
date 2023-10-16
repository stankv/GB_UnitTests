package Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала калькулятора с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        try {
            Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        System.out.println(Calculator.calculation(2_147_483_647, 0, '+')); // integer overflow
        

        //-------------------------------------------------------------------------------------------------------------
        // Проверка функции calculatingDiscount
        // 1. Нормальные данные и граничные условия:

        // скидка 100%
        assertThat(Calculator.calculatingDiscount(100, 100)).isEqualTo(0);
        // цена 100, скидка 45%, итоговая стоимость 55
        assertThat(Calculator.calculatingDiscount(100, 45)).isEqualTo(55.0);
        // нулевая скидка
        assertThat(Calculator.calculatingDiscount(100, 0)).isEqualTo(100.0);
        
        // 2. Проверка ожидаемых исключений, с использованием утверждений AssertJ:
        //Проверка при отрицательной цене
        assertThatThrownBy(()->Calculator.calculatingDiscount(-100, 45)).isInstanceOf(ArithmeticException.class);
        // Проверка при нулевой цене
        assertThatThrownBy(()->Calculator.calculatingDiscount(0, 20)).isInstanceOf(ArithmeticException.class);
        // Проверка, если скидка отрицательная
        assertThatThrownBy(()->Calculator.calculatingDiscount(100, -30)).isInstanceOf(ArithmeticException.class);
        // Проверка если скидка более 100%
        assertThatThrownBy(()->Calculator.calculatingDiscount(100, 110)).isInstanceOf(ArithmeticException.class);
    }

}