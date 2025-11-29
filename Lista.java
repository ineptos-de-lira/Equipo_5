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

void crearestudiante() {
  System.out.println("Ingrese el nombre del estudiante");
  String nombre = sc.nextLine();
  System.out.println("Ingrese la matricula del estudiante");
  String matricula = sc.nextLine();
  String numero = String.valueOf(estudiantes.size() + 1);
  Estudiante nuevoEstudiante = new Estudiante(numero, nombre);
  estudiantes.add(nuevoEstudiante);
  System.out.println("Estudiante registrado exitosamente");
} 