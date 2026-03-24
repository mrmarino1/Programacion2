import math

class MiPunto:
    def __init__(self, x = 0.0, y = 0.0):
        self.__x = x
        self.__y = y

    def getX(self):
        return self.__x

    def getY(self):
        return self.__y

    def distancia(self, punto):
        return self.distancia_coord(punto.getX(), punto.getY())

    def distancia_coord(self, x, y):
        return math.sqrt((x - self.__x)**2 + (y - self.__y)**2)

    def __str__(self):
        return f"({self.__x}, {self.__y})"

punto1 = MiPunto() 
punto2 = MiPunto(10, 30.5)
d = punto1.distancia(punto2)
print(f"Punto 1: {punto1.__str__()}")
print(f"Punto 2: {punto2.__str__()}")
print(f"Distancia {d:.2f}")
