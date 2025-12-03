import java.util.ArrayList;
import java.util.Scanner;

class Lista {
  private ArrayList<Estudiante> estudiantes;
  private Scanner sc;

  Lista() {
    estudiantes = new ArrayList<Estudiante>();
    sc = new Scanner(System.in);
  }
  void crearestudiante() {
    System.out.println("Digite el nombre del estudiante");
    String nombre = sc.nextLine();
    String numero = String.valueOf(estudiantes.size() + 1);
    Estudiante nuevoEstudiante = new Estudiante(numero, nombre);
    estudiantes.add(nuevoEstudiante);
  }

  void eliminarestudiante() {
  System.out.println("Digite el numero del estudiante a eliminar");
  int numero = sc.nextInt();
  sc.nextLine();
  numero--;
  estudiantes.remove(numero);
  }}
