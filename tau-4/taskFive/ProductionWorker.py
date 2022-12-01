from taskFive.Employee import Employee


class ProductionWorker(Employee):
    def __init__(self, firstname, lastname, change_number, pay_hour):
        super().__init__(firstname, lastname)
        if change_number != 1 and change_number != 2:
            raise Exception
        if change_number == 1:
            print('dzienna')
            self.__change_number = change_number
        if change_number == 2:
            print('nocna')
            self.__change_number = change_number
        self.__pay_hour = pay_hour

    def set_change_number(self, changenumber):
        self.__change_number = changenumber

    def get_change_number(self):
        return self.__change_number

    def set_pay_hour(self, payhour):
        self.__pay_hour = payhour

    def get_pay_hour(self):
        return self.__pay_hour