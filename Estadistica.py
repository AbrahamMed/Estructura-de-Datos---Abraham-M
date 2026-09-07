import random
import statistics

# 1. Generar 50 números aleatorios entre 1 y 100
numeros = [random.randint(150, 250) for _ in range(50)]

# 2. Cálculos estadísticos con el módulo integrado 'statistics'
media = statistics.mean(numeros)
mediana = statistics.median(numeros)
modas = statistics.multimode(numeros)  # Devuelve todas las modas si hay empate
desviacion_muestral = statistics.stdev(numeros)      # Desviación estándar muestral (s)
desviacion_poblacional = statistics.pstdev(numeros)  # Desviación estándar poblacional (σ)
# Varianza (es el cuadrado de la desviación estándar)
varianza_muestral = statistics.variance(numeros)
varianza_poblacional = statistics.pvariance(numeros)

# 3. Mostrar resultados
print("--- DATOS GENERADOS ---")
print(numeros)

print("\n--- RESULTADOS ESTADÍSTICOS ---")
print(f"Media: {media:.2f}")
print(f"Mediana: {mediana:.2f}")
print(f"Moda(s): {modas}")
print(f"Desviación estándar muestral (s): {desviacion_muestral:.2f}")
print(f"Desviación estándar poblacional (σ): {desviacion_poblacional:.2f}")
print(f"Varianza muestral (s²): {varianza_muestral:.2f}")
print(f"Varianza poblacional (σ²): {varianza_poblacional:.2f}")