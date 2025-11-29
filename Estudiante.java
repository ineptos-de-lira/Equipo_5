public class Estudiante {
     private String numero;
   private String nombre;
  private String asistencia;

   Estudiante(String numer, String nobre) {
    this.numero = numero;
 this.nombre = nombre;
    this.asistencia = "Ausente";
  }

  String obtenerDatos() {
 numero + ". | " + nombre + " | " + asistencia;
  }
}
