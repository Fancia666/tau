import unittest
from assertpy import assert_that

from taskSix.Car import Car


class CarTest(unittest.TestCase):

    def setUp(self):
        self.temp = Car("Ford", 1990)

    def test_Car_accelerate_once_positive(self):
        self.temp.accelerate()
        assert_that(self.temp.get_speed()).is_equal_to(5)

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
