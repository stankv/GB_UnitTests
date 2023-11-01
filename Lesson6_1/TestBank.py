# Задание 3
# Создайте два класса: Person и Bank. Класс Person должен иметь метод transfer_money,
# который позволяет перевести деньги в Bank. Класс Bank должен иметь метод
# receive_money.
# Напишите тесты, проверяющие корректность взаимодействия этих классов.

from unittest.mock import Mock
from Bank import Bank
from Person import Person

def test_bank():
    person = Person(1000)
    bank = Bank()
    person.transfer_money(bank, 500)
    assert bank.balance == 500
    assert person.balance == 500

# Задание 4
# В предыдущем задании используйте unittest.mock для создания мок-объекта Bank.
# Напишите тест, в котором вы проверите, вызывается ли метод receive_money с правильным
# аргументом.

def test_mock():
    person = Person(1000)
    bank = Mock()
    person.transfer_money(bank, 500)
    bank.receive_money.assert_called_with(500)    #здесь проверяем что вызывался метод reseive_money
