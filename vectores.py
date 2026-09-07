def mostrar_vector(datos):
    for dato in datos:
        print(dato)

def media(datos):
    suma = 0
    for i in range(len(datos)):
        suma = suma + datos[i]
    return suma/len(datos)

pares = [2,4,6,8,10]
impares = [1,3,5,7,9]

mostrar_vector(pares)
print(f"Media = {media(pares)}")

mostrar_vector(impares)
print(f"Media = {media(impares)}")


