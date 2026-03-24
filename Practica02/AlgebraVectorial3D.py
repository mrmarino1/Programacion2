import math

class Vector3D:
    def __init__(self, a1=0.0, a2=0.0, a3=0.0):
        self.__a1 = float(a1)
        self.__a2 = float(a2)
        self.__a3 = float(a3)

    def get_a1(self):
        return self.__a1

    def get_a2(self):
        return self.__a2

    def get_a3(self):
        return self.__a3

    def __add__(self, num):
        return Vector3D(
            self.__a1 + num.__a1,
            self.__a2 + num.__a2,
            self.__a3 + num.__a3
        )

        # Método para suma
    def sumar(self, otro):
        return self + otro

    # Método para producto escalar
    def producto_punto(self, otro):
        return self * otro

    # Método para producto cruz
    def producto_cruz(self, otro):
        return self ^ otro

    # Método para escalar
    def escalar(self, r):
        return self * r

    def __mul__(self, num):
        if isinstance(num, (int, float)):
            return Vector3D(
                self.__a1 * num,
                self.__a2 * num,
                self.__a3 * num
            )
        elif isinstance(num, Vector3D):
            return (
                self.__a1 * num.__a1 +
                self.__a2 * num.__a2 +
                self.__a3 * num.__a3
            )

    def __rmul__(self, num):
        return self.__mul__(num)

    def __abs__(self):
        return math.sqrt(
            self.__a1**2 + self.__a2**2 + self.__a3**2
        )

    def normal(self):
        magnitud = abs(self)
        if magnitud == 0:
            raise ValueError("No se puede normalizar un vector nulo")
        return Vector3D(
            self.__a1 / magnitud,
            self.__a2 / magnitud,
            self.__a3 / magnitud
        )

    def __xor__(self, num):
        return Vector3D(
            self.__a2 * num.__a3 - self.__a3 * num.__a2,
            self.__a3 * num.__a1 - self.__a1 * num.__a3,
            self.__a1 * num.__a2 - self.__a2 * num.__a1
        )

    def __str__(self):
        return f"({self.__a1:.2f}, {self.__a2:.2f}, {self.__a3:.2f})"


a = Vector3D(2, 3, 4)
b = Vector3D(1, -1, 2)
print("Vector a:", a)
print("Vector b:", b)
print("a + b =", a.sumar(b))
print("Producto punto =", f"{a.producto_punto(b):.2f}")
print("Producto cruz =", a.producto_cruz(b))
print("Escalar 2*a =", a.escalar(2)) 