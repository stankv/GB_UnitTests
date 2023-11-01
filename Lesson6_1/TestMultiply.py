# Напишите функцию multiply(a, b), которая возвращает произведение a и b.
# Затем напишите параметризованный тест, который проверяет эту функцию на нескольких наборах данных.

import pytest

def multiply(a, b):
    return a * b

@pytest.mark.parametrize("a, b, result", [(1,2,2),
                                          (2,3,6),
                                          (4,-7,-28),
                                          (1,0,0)
                                          ]
                         )
def test_multiplay(a, b, result):
    assert multiply(a, b) == result