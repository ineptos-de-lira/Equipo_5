public class Estudiante {
    private String numero;
     private String nombre;
private String asistencia;

   Estudiante(String numeo, String nobre) {
 this.numero = numero;
    this.nombre = nombre;
      this.asistencia = "Ausente";
  }

  Sring obtenerDatos() {
return numeo + ". | " + nombre + " | " + asistencia;
  }
}
