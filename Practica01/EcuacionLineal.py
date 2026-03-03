class EcuacionLineal:
    def __init__(self, a, b, c, d, e, f):
        self.__a = a
        self.__b = b
        self.__c = c
        self.__d = d
        self.__e = e
        self.__f = f

    def tieneSolucion(self):
        sol = (self.__a * self.__d) - (self.__b * self.__c)
        if sol != 0.0:
            return True
        else:
            return False
    
    def getX(self):
        if self.tieneSolucion():
            x = ((self.__e*self.__d)-(self.__b*self.__f))/((self.__a * self.__d) - (self.__b * self.__c))
            return x
        else:
            return False
    
    def getY(self):
        if self.tieneSolucion():
            y = ((self.__a*self.__f)-(self.__e*self.__c))/((self.__a * self.__d) - (self.__b * self.__c))
            return y
        else:
            return False
        
    def  __str__(self):
        return f"x = {self.getX():.1f} , y = {self.getY():.1f} "

    def __del__(self):
        return "Objeto eliminado"
    
class Main():
    a = float(input("a:"))
    b = float(input("b:"))
    c = float(input("c:"))
    d = float(input("d:"))
    e = float(input("e:"))
    f = float(input("f:"))
    ecuacion = EcuacionLineal(a, b, c, d, e, f)
    if(ecuacion.tieneSolucion()):
        print(ecuacion.__str__())
    else:
        print("La ecuacion no tiene solucion")
    
    del ecuacion