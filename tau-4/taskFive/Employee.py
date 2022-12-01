class Employee:
    def __init__(self, firstname, lastname):
        self.__firstname = firstname
        self.__lastname = lastname

    def set_first_name(self, firstname):
        self.__firstname = firstname

    def get_first_name(self):
        return self.__firstname

    def set_last_name(self, lastname):
        self.__firstname = lastname

    def get_last_name(self):
        return self.__lastname