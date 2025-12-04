import java.util.ArrayList;
import java.util.Scanner;

class Lista {
  private ArrayList<Estudiante> estudiantes;
  private Scanner sc;

  Lista() {
    estudiantes = new ArrayList<Estudiante>();
    sc = new Scanner(System.in);
  }

  void mostrarPasedeLista() {
    System.out.println("=============== Pase de Lista ===============");
    if (estudiantes.isEmpty()) {
      System.out.println("No hay estudiantes registrados");
    } else {
      for (Estudiante est : estudiantes) {
        System.out.println(est.obtenerDatos());
      }
    }
  }

  void crearestudiante() {
    System.out.println("Digite el nombre del estudiante");
    String nombre = sc.nextLine();
    System.out.println("Digite la matricula del estudiante");
    String matricula = sc.nextLine();
    String numero = String.valueOf(estudiantes.size() + 1);
    Estudiante nuevoEstudiante = new Estudiante(numero, nombre);
    estudiantes.add(nuevoEstudiante);
    System.out.println("Estudiante registrado exitosamente");
  }

  void actualizarEstado() {
    System.out.println("Digite el numero del estudiante a marcar");
    int numero = sc.nextInt();
    sc.nextLine();
    numero--;
    if (numero >= 0 && numero < estudiantes.size()) {
      estudiantes.get(numero).marcarAsistencia();
      System.out.println("Asistencia registrada correctamente");
    } else {
      System.out.println("Numero de estudiante no valido");
    }
  }

  void eliminarestudiante() {
    System.out.println("Digite el numero del estudiante a eliminar");
    int numero = sc.nextInt();
    sc.nextLine();
    numero--;
    if (numero >= 0 && numero < estudiantes.size()) {
      estudiantes.remove(numero);
      System.out.println("Estudiante eliminado correctamente");
    } else {
      System.out.println("Numero de estudiante no valido");
    }
  }

  // Metodos para pruebas unitarias
  void agregarEstudiante(Estudiante est) {
    estudiantes.add(est);
  }

  int obtenerCantidadEstudiantes() {
    return estudiantes.size();
  }

  Estudiante obtenerEstudiante(int indice) {
    if (indice >= 0 && indice < estudiantes.size()) {
      return estudiantes.get(indice);
    }
    return null;
  }

  void eliminarEstudiantePorIndice(int indice) {
    if (indice >= 0 && indice < estudiantes.size()) {
      estudiantes.remove(indice);
    }
  }

  boolean estaVacia() {
    return estudiantes.isEmpty();
  }
}
