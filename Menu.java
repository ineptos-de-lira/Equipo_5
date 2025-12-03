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
    System.out.println("\n --- Control de Asistencias ---");
    System.out.println("1. Registrar nuevo estudiante: ");
    System.out.println("2. Ver pase de lista: ");
    System.out.println("3. MArcar asistencia de estudiantes: ");
    System.out.println("4. Eliminar estudiante");
    System.out.println("5. Salir del sistema: ");
    System.out.println("Selecciona una opcion: ");
  }
    
  private void procesarOpcion(String opcion) {
    switch (opcion.trim()) {
      case "1":
        tareaManager.crearestudiante();
        break;
      case "2":
        tareaManager.mostrarPasedeLista();
        break;
      case "3":
        tareaManager.actualizarEstado();
        break;
      case "4":
        tareaManager.eliminarestudiante();
        break;
      case "5":
        System.out.println("Adios");
        return;
      default:
        System.out.println("Eligue una opcion correcta");
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
      System.out.println(" ");
    }
  }  
}