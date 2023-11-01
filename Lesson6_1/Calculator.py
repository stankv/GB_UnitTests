# Напишите функцию divide(a, b), которая возвращает результат деления a на b. Если b равно нулю, функция
# должна вызывать исключение ZeroDivisionError.
# Напишите тест, который проверяет, что при попытке деления на ноль функция вызывает исключение
# ZeroDivisionError.

class Calculator:
    def add(self, a, b):
        return a + b

    def subtract(self, a, b):
        return a - b

    def multiply(self, a, b):
        return a * b

    def divide(self, a, b):
        if b == 0:
            raise ZeroDivisionError("Cannot divide by zero!")
        return a / b
