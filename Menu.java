import java.util.Scanner;

class Menu {
    private Lista tareaManager;
 private Scanner scanner; 
 private String opcion;
    
    Menu() {
        tareaManager = new Lista();
        scanner = new Scanner(System.in);
    }
    
    private void mostrarOpciones() {
        System.out.println("\n====Control de Asistencia====");
        System.out.println("1. Registrar un nuevo estudiante ");
        System.out.println("2. Ver pase de lista");
        System.out.println("3. Marcar asistencia de estudiante ");
        System.out.println("4. Eliminar Estudiantes ");
        System.out.println("5. Salir ")
        System.out.println("Seleccione una opcion")
    }
    
    private void procesarOpcion() {
        switch (opcion.trim()) {
            case "1":
            break;
            case "2":
            break;
            case "3":
            break;
            case "4":
            break;
            case "5":
            System.out.println("Saliendo del sistema");
            return;
            default:
            System.out.println("Selecciona una opcion de las que te dan a elegir pendejo"),
            break;
        }
    }
    
    void ejecutar() {
        while (true) {
            mostrarOpciones();
            opcion = scanner.nextLine();
            if (opcion.equals("5")) {
                break;
            }
            procesarOpcion(opcion);
            System.out.println(" ")
        }
    }
     
}