from car import Car
from account import Account
if __name__ == "__main__":
    print("hola mundo")
    car = Car("UIO620", Account("Alex", "114050"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("PAS620", Account("Diego", "211141"))
    print(vars(car2))
    print(vars(car2.driver))