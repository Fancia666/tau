from hamcrest.core.base_matcher import BaseMatcher
from hamcrest.core.helpers.hasmethod import hasmethod


class IsEmployeeOnNocna(BaseMatcher):
    def __init__(self, change):
        self.change = change

    def _matches(self, worker):
        if not hasmethod(worker, "get_change_number") or (self.change != 2):
            return False
        return worker.get_change_number() == self.change

    def describe_to(self, description):
        description.append_text("Worker is on dzienna ").append_text(self.change)


class IsEmployeeRich(BaseMatcher):
    def __init__(self, pay_hour):
        self.change = pay_hour

    def _matches(self, worker):
        if not hasmethod(worker, "get_change_number") or (self.pay_hour < 100000000):
            return False
        return worker.get_pay_hour() == self.pay_hour

    def describe_to(self, description):
        description.append_text("Worker is rich").append_text(self.change)


def on_nocna():
    return IsEmployeeOnNocna(1)

def is_rich():
    return IsEmployeeRich(1000000000)