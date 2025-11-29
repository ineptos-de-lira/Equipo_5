import java.util.ArrayList;
import java.util.Scanner;
class Lista {
	private ArrayList<Estudiante> estudiantes;
  private Scanner sc;
}
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
