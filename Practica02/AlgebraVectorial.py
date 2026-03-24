import math

class Vector:
    def __init__(self, x=0.0, y=0.0):
        self.__x = x
        self.__y = y

    def getX(self):
        return self.__x

    def getY(self):
        return self.__y

    def modulo(self):
        return math.sqrt(self.__x**2 + self.__y**2)

    def producto_punto(self, v):
        return self.__x * v.getX() + self.__y * v.getY()

    def producto_cruz(self, v):
        return self.__x * v.getY() - self.__y * v.getX()

    def __add__(self, v):
        return Vector(self.__x + v.getX(), self.__y + v.getY())

    def __sub__(self, v):
        return Vector(self.__x - v.getX(), self.__y - v.getY())

    def __str__(self):
        return f"({self.__x:.2f}, {self.__y:.2f})"


class AlgebraVectorial:
    def __init__(self, a = None, b = None):
        self.__a = a
        self.__b = b

    def es_perpendicular(self, tipo=1):
        a = self.__a
        b = self.__b

        if tipo == 1:
            return abs((a + b).modulo() - (a - b).modulo()) == 0

        elif tipo == 2:
            return abs((a - b).modulo() - (b - a).modulo()) == 0

        elif tipo == 3:
            return abs(a.producto_punto(b)) == 0

        elif tipo == 4:
            return abs((a + b).modulo()**2 - (a.modulo()**2 + b.modulo()**2)) == 0

    def es_paralelo(self, tipo=1):
        a = self.__a
        b = self.__b

        if tipo == 1:
            if b.getX() != 0:
                r = a.getX() / b.getX()
                return abs(a.getY() - r * b.getY()) == 0
            elif b.getY() != 0:
                r = a.getY() / b.getY()
                return abs(a.getX() - r * b.getX()) == 0
            else:
                return False

        elif tipo == 2:
            return abs(a.producto_cruz(b)) == 0

    def proyeccion(self):
        a = self.__a
        b = self.__b

        escalar = a.producto_punto(b) / (b.modulo()**2)
        return Vector(b.getX() * escalar, b.getY() * escalar)

    def componente(self):
        a = self.__a
        b = self.__b

        return a.producto_punto(b) / b.modulo()

a = Vector(2, 3)
b = Vector(4, 6)

av = AlgebraVectorial(a, b)
if av.es_perpendicular(3):
    print(f"{a} es perpendicular a {b}")
else:
    print(f"{a} no es perpendicular a {b}")

if av.es_paralelo(2):
    print(f"{a} es paralelo a {b}")
else:
    print(f"{a} no es paralelo a {b}")

print("Proyección:", av.proyeccion())
print("Componente:", f"{av.componente():.2f}")