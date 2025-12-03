/**
 * Aqui se crea la clase de estudiante y sus metodos.
 */

public class Estudiante {
  private String numero;
  private String nombre;
  private String asistencia;

  Estudiante(String numeo, String nobre) {
    this.numero = numero;
    this.nombre = nombre;
    this.asistencia = "Ausente";
  }

  String obtenerDatos() {
    return numeo + ". | " + nombre + " | " + asistencia;
  }

  void marcarAsistencia() {
    if (asistencia.equals("Ausente")) {
      asistencia = "Presente";
    } else {
      asistencia = "Ausente";
    }
  }

  String getAsistencia() {
    return asistencia;
  }
}
