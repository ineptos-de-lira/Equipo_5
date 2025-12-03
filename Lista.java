import java.util.ArrayList;
import java.util.Scanner;

class Lista {
  ArrayList<Estudiante> estudiantes;
  Scanner sc;

  Lista() {
    estudiantes = new ArrayList<Estudiante>();
    sc = new Scanner(System.in);
  }
