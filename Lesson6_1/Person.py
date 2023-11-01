class Person:

    def __init__(self, balance):
        self.balance = balance

    def transfer_money(self, bank, amount):
        if self.balance < amount or amount <= 0:
            raise ValueError("Недопустимая сумма перевода")
        self.balance -= amount
        bank.receive_money(amount)