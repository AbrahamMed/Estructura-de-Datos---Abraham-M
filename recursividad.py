import sys

# Ampliamos el límite de seguridad de Python a 2000 para que soporte 1000 trámites
sys.setrecursionlimit(2000)

def procesar_tramite_simple(numero_tramite):
    """Recursividad simple: Un trámite lleva al siguiente sin anidarse."""
    if numero_tramite == 0:
        return "¡Todos los trámites fueron sellados!"
    else:
        # Llamada recursiva normal (no anidada)
        return procesar_tramite_simple(numero_tramite - 1)

print("Iniciando la montaña de papel...")
resultado = procesar_tramite_simple(1000)
print(resultado)