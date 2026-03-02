import math

class EcuacionLineal:
    def __init__(self, a, b, c):
        self.__a = a
        self.__b = b
        self.__c = c
    def getDiscriminante(self):
        discriminante = pow(self.__b, 2) - (4*self.__a*self.__c)
        return discriminante
    
    def getRaiz1(self):
        if self.getDiscriminante() < 0:
            return 0
        else:
            r1 = ((- self.__b) + math.sqrt(self.getDiscriminante())) / (2 * self.__a)
            return r1
            
    def getRaiz2(self):
        if self.getDiscriminante() < 0:
            return 0
        else:
            r2 = ((- self.__b) - math.sqrt(self.getDiscriminante())) / (2 * self.__a)
            return r2
        
class Main():
    a = int(input("a:"))
    b = int(input("b:"))
    c = int(input("c:"))
    ecuacion = EcuacionLineal(a, b, c)
    if(ecuacion.getDiscriminante() > 0):
        print(f"La ecuacion tiene dos raices: {ecuacion.getRaiz1():.6f} y {ecuacion.getRaiz2():.6f}")
    elif(ecuacion.getDiscriminante() == 0):
        print(f"La ecuacion tiene una raiz {ecuacion.getRaiz1():.6f}")
    else:
        print("La ecuacion no tiene raices reales")