import unittest

from assertpy import assert_that
from hamcrest import is_


from taskFive.HamcrestOwnMatcher import on_nocna, is_rich
from taskFive.ProductionWorker import ProductionWorker


class HamcrestOwnMatcherTest(unittest.TestCase):
    def test_worker_on_nocna(self):
        working_person = ProductionWorker("Ziomek", "Ziomkowski", 1, 123)
        working_person.set_change_number(2)
        assert_that(working_person, is_((on_nocna())))

    def test_worker_is_rich(self):
        working_person = ProductionWorker("Ziomek", "Ziomkowski", 1, 1000000000)
        assert_that(working_person, is_((is_rich())))
