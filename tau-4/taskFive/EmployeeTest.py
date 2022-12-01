import unittest

from hamcrest import equal_to, instance_of, assert_that, starts_with, ends_with, contains_string, calling, \
    raises, equal_to_ignoring_case, has_length

from taskFive.Employee import Employee
from taskFive.ProductionWorker import ProductionWorker


class EmployeeTest(unittest.TestCase):
    def test_name_equal_surname(self):
        checker = Employee("John", "John")

        assert_that(checker.get_first_name(), equal_to(checker.get_last_name()))

    def test_probably_woman(self):
        checker = Employee("Ala", "Nowak")

        assert_that(checker.get_first_name(), ends_with("a"))

    def test_starts_with_B(self):
        checker = Employee("Bartek", "Kowalski")

        assert_that(checker.get_first_name(), starts_with("B"))

    def test_probably_most_common_polish_surname(self):
        checker = Employee("Bartek", "Kowalski")
        assert_that(checker.get_last_name(), contains_string("Kowalski"))

    def test_caseinsensitive(self):
        checker = Employee("bartek", "Kowalski")
        assert_that(checker.get_first_name(), equal_to_ignoring_case("Bartek"))

    def test_firstname_string(self):
        checker = Employee("bartek", "Kowalski")
        assert_that(checker.get_first_name(), instance_of(str))

    def test_firstname_short(self):
        checker = Employee("Ala", "Kowalska")
        assert_that(checker.get_first_name(), has_length(3))

    def test_wrong_chagne(self):
        checker = ProductionWorker("Tomek", "Tomecki", 1, 100)
        assert_that(calling(checker.set_change_number(55)),
                   raises(Exception))