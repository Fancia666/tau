import unittest

from assertpy import add_extension, assert_that

from taskEight.Car import Car


def is_polish_car(self):
    if self.val.lower() not in 'polonez':
        return self.error(f'{self.val} not Polish car')
    return self


def is_car_not_moving(self):
    if self.val > 0:
        return self.error(f'{self.val} speed indicates that car is moving')
    return self


add_extension(is_polish_car)
add_extension(is_car_not_moving)


class CarTest(unittest.TestCase):

    def test_Car_is_polish_car(self):
        temp = Car("Polonez", 1990)
        assert_that(temp.get_make()).is_polish_car()

    def test_Car_is_not_polish_car(self):
        temp = Car("BMW", 2020)
        assert_that(temp.get_make()).is_polish_car()


    def test_Car_is_not_moving(self):
        temp = Car("Polonez", 1990)
        assert_that(temp.get_speed()).is_car_not_moving()

    def test_Car_is_not_not_moving(self):
        temp = Car("Polonez", 1990)
        temp.accelerate()
        assert_that(temp.get_speed()).is_car_not_moving()