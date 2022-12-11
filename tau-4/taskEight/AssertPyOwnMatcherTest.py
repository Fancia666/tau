import unittest
from assertpy import assert_that

from taskEight.Car import Car
from taskEight.AssertPyOwnMatcher import is_car_not_moving, is_polish_car


class CarTest(unittest.TestCase):

    def setUp(self):
        self.temp = Car("Ford", 1990)

    def test_Car_is_plish_car(self):
        temp = Car("Polonez", 1990)
        temp.accelerate()
        assert_that(temp.get_make()).taskEight.AssertPyOwnMatcher.is_polish(car)

    def test_Car_break_once_positive(self):
        self.temp.accelerate()
        self.temp.brake()
        assert_that(self.temp.get_speed()).is_equal_to(0)

    def test_Car_starts_with_F(self):
        self.temp.accelerate()
        assert_that(self.temp.get_make()).starts_with("F")

    def test_Car_too_young_car_raises_exception(self):
        assert_that(Car).raises(Exception).when_called_with(1885, "Mustang")

    def test_Car_accelerate_not_equals_zero(self):
        self.temp.accelerate()
        assert_that(self.temp.get_speed()).is_greater_than(0)

    def test_Car_is_ford(self):
        assert_that(self.temp.get_make()).contains_only('F', 'o', 'r', 'd')

    def test_car_year_is_int(self):
        assert_that(self.temp.get_year_model()).is_instance_of(int)

    def test_Car_is_not_bmw(self):
        assert_that(self.temp.get_make()).does_not_contain('B', 'M', 'W')
