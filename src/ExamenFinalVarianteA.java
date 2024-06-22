import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExamenFinalVarianteA {

    private Scanner scanner;

    public ExamenFinalVarianteA() {
        scanner = new Scanner(System.in);
    }
     /*EJERCICIO 1 SERIE II */
    public void OperacionesConNumeros() {
        System.out.println("Ingrese el primer numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.println("Ingrese 1 si desea sumar: ");
        System.out.println("Ingrese 2 si desea restar: ");
        System.out.println("Ingrese 3 si desea multiplicar: ");
        System.out.println("Ingrese 4 si desea dividir: ");
        int operadores = scanner.nextInt();

        switch (operadores) {
            case 1:
                int suma = n1 + n2;
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                int resta = n1 - n2;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                int multiplicacion = n1 * n2;
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;
            case 4:
                if (n2 != 0){
                    int division = n1 / n2;
                    System.out.println("La division es: " + division);
                } else {
                    System.out.println("La division es: 0");
                }
                break;
            default:
                System.out.println("El numero no es valido");
        }

    }
    /*EJERCICIO 1 Y 2 DE SERIE III */
    public void Estudiantes() {
        String[] estudiantes = new String[10];
        int[] calificaciones = new int[10];
        int indice = 0;

        while (true) {
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiante");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                if (indice < estudiantes.length) {
                    System.out.println("Ingrese el nombre del estudiante");
                    estudiantes[indice] = scanner.nextLine();
                    System.out.println("Ingrese la calificacion del estudiante");
                    calificaciones[indice] = scanner.nextInt();
                    scanner.nextLine();
                    indice++;
                } else {
                    System.out.println("No se pueden añadir mas estudiantes");
                }
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del estudiante a eliminar");
                String nombreEliminar = scanner.nextLine();
                boolean encontrado = false;

                for (int i = 0; i < estudiantes.length; i++) {
                    if (nombreEliminar.equals(estudiantes[i])) {
                        estudiantes[i] = null;
                        calificaciones[i] = 0;
                        encontrado = true;
                        System.out.println("Estudiante eliminado");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Estudiante no existe");
                }
            } else if (opcion == 3) {
                System.out.println("Lista de estudiantes:");
                for (int i = 0; i < estudiantes.length; i++) {
                    if (estudiantes[i] != null) {
                        System.out.println(estudiantes[i] + " - " + calificaciones[i]);
                    }
                }
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
     /*EJERCICIO 3 DE SERIE III*/
    public void OrdenamientoDeCalificaciones() {
        ArrayList<Integer> calificaciones = new ArrayList<>();

        while (true) {
            System.out.println("Añadir calificacion");
            System.out.println("Ordenar de mayor a menor");
            System.out.println("Ordenar de menor a mayor");
            System.out.println("Mostrar calificaciones");
            System.out.println("Salir");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese la calificacion");
                calificaciones.add(scanner.nextInt());
            } else if (opcion == 2) {
                Collections.sort(calificaciones, Collections.reverseOrder());
                System.out.println("Calificaciones ordenadas de mayor a menor");
            } else if (opcion == 3) {
                Collections.sort(calificaciones);
                System.out.println("Calificaciones ordenadas de menor a mayor");
            } else if (opcion == 4) {
                System.out.println("Lista de calificaciones:");
                for (int calificacion : calificaciones) {
                    System.out.println(calificacion);
                }
            } else if (opcion == 5) {
                break;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }



    public void mostrarMenu() {
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Operaciones");
        System.out.println("2. Estudiantes");
        System.out.println("3. Ordenamiento");
    }



    public static void main(String[] args) {
        ExamenFinalVarianteA ejercicios = new ExamenFinalVarianteA();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            ejercicios.mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ejercicios.OperacionesConNumeros();
                    break;
                case 2:
                    ejercicios.Estudiantes();
                    break;
                case 3:
                    ejercicios.OrdenamientoDeCalificaciones();
                    break;
                case 4:
                    System.out.println("Saliendo del programa... ");
                break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");

            }

        } while (opcion != 4);
        }
    }
