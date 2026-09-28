def fibonacci(n):
    # Caso base: si n es 0 o 1, devuelve el mismo número
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    # Caso recursivo: suma los dos términos anteriores
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

# Ejemplo para calcular el término 6 de la serie
termino = int(input("Ingresa el termino a llegar: "))
resultado = fibonacci(termino)
print(f"El término {termino} de Fibonacci es: {resultado}")
