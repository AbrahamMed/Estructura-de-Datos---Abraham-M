import tkinter as tk
from tkinter import simpledialog

root = tk.Tk()
root.withdraw()


calificaciones = [0]*5

for i in range (5):
    calificaciones[i] = simpledialog.askinteger("Entrada", "Captura la calificación: ")

