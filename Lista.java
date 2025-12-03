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
      for (Estudiante est : estudiantes) {
        System.out.println(est.obtenerDatos());
      }
  }
}
