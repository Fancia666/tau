class Car:
    def __init__(self, __make, __year_model):
        if __year_model < 1886:
            raise Exception
        self.__make = __make
        self.__year_model = __year_model
        self.__speed = 0

    def accelerate(self):
        self.__speed = self.__speed + 5

    def brake(self):
        if self.__speed < 0:
            raise Exception
        self.__speed = self.__speed - 5

    def get_speed(self):
        return self.__speed

    def get_make(self):
        return self.__make

    def get_year_model(self):
        return self.__year_model