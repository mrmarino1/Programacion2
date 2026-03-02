import math
def promedio(datos):
    suma = 0
    for i in range(len(datos)):
        suma += datos[i]
    return suma / len(datos)

def desviacion(datos):
    prom = promedio(datos)
    suma = 0
    for i in range(len(datos)):
        suma += (datos[i] - prom) ** 2
    return math.sqrt(suma / (len(datos) - 1))

def main():
    numeros = []
    for i in range(10):
        numero = float(input("x_" + str(i+1) + ": "))
        numeros.append(numero)
    promedio = promedio(numeros)
    desviacion = desviacion(numeros)
    print("El promedio es {:.2f}".format(promedio))
    print("La desviacion estandar es {:.5f}".format(desviacion))

main()