# Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
# a. Рассчитывает среднее значение каждого списка.
# b. Сравнивает эти средние значения и выводит соответствующее сообщение:
# - "Первый список имеет большее среднее значение", если среднее значение первого списка больше.
# - "Второй список имеет большее среднее значение", если среднее значение второго списка больше.
# - "Средние значения равны", если средние значения списков равны.


class CompAvg:

    @staticmethod
    def find_average(numbers):
        if not numbers:
            return 0
        return sum(numbers) / len(numbers)

    @staticmethod
    def compare_averages(numbers1, numbers2):
        avg1 = Task.find_average(numbers1)
        avg2 = Task.find_average(numbers2)
        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        elif avg1 < avg2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"