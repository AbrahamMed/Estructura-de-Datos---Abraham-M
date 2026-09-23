import java.util.Scanner;
public class ArregloMatrizAM {
    public class MatrizAlumnos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- CONFIGURACIÓN DE LA MATRIZ ---");
        System.out.print("Ingresa la cantidad total de alumnos: ");
        int numAlumnos = teclado.nextInt();
        
        System.out.print("Ingresa la cantidad total de materias: ");
        int numMaterias = teclado.nextInt();

        long tiempoInicio = System.nanoTime();
        
        int[][] matriz = new int[numMaterias][numAlumnos];

        for (int i = 0; i < numMaterias; i++) {
            for (int j = 0; j < numAlumnos; j++) {
                matriz[i][j] = (int)(Math.random() * 10) + 1; 
            }
        }
        
        long tiempoFin = System.nanoTime();
        
        long tiempoTotalNanos = tiempoFin - tiempoInicio;
        double tiempoTotalMilis = tiempoTotalNanos / 1000000.0; 

        System.out.println("\n-> ¡Matriz creada y llenada con éxito!");
        System.out.println("-> Tiempo de ejecución: " + tiempoTotalNanos + " nanosegundos (" + tiempoTotalMilis + " ms).");
        

        for (int i = 0; i < numMaterias; i++) {
            for (int j = 0; j < numAlumnos; j++) {
                matriz[i][j] = (int)(Math.random() * 10) + 1; 
            }
        }

        System.out.println("--- TABLA DE CALIFICACIONES ---");

        System.out.print("\t\t"); 
        
        for (int j = 0; j < numAlumnos; j++) {
            System.out.print("Alumno" + (j + 1) + "\t"); 
        }
        System.out.println();
        
        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Materia " + (i + 1) + ":\t"); 
            
            for (int j = 0; j < numAlumnos; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            
            System.out.println(); 
        }

        System.out.println("\n--- BÚSQUEDA DE CALIFICACIÓN ---");
        
        System.out.print("Ingresa el número de alumno a buscar (1 - " + numAlumnos + "): ");
        int alumnoBuscado = teclado.nextInt();
        
        System.out.print("Ingresa el número de materia a buscar (1 - " + numMaterias + "): ");
        int materiaBuscada = teclado.nextInt();
        
        if (alumnoBuscado >= 1 && alumnoBuscado <= numAlumnos && materiaBuscada >= 1 && materiaBuscada <= numMaterias) {
            
            int indiceMateria = materiaBuscada - 1;
            int indiceAlumno = alumnoBuscado - 1;
            
            int calificacionEncontrada = matriz[indiceMateria][indiceAlumno];
            
            System.out.println("\n-> La calificación del Alumno " + alumnoBuscado + 
                               " en la Materia " + materiaBuscada + " es: " + calificacionEncontrada);
        } else {
            System.out.println("\n-> Error: Ingresaste un alumno o materia que no existe. Revisa los límites.");
        }
        
        teclado.close();
    }
}
}
