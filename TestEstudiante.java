import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Estudiante.
 */
public class TestEstudiante {

    @Test
    void testConstructorEstudiante() {
        Estudiante est = new Estudiante("1", "Juan");
        assertEquals("Ausente", est.getAsistencia());
    }

    @Test
    void testObtenerDatos() {
        Estudiante est = new Estudiante("1", "Juan");
        assertEquals("1. | Juan | Ausente", est.obtenerDatos());
    }

    @Test
    void testMarcarAsistencia() {
        Estudiante est = new Estudiante("1", "Juan");
        est.marcarAsistencia();
        assertEquals("Presente", est.getAsistencia());
    }

    @Test
    void testMarcarAsistenciaDoble() {
        Estudiante est = new Estudiante("1", "Juan");
        est.marcarAsistencia();
        est.marcarAsistencia();
        assertEquals("Ausente", est.getAsistencia());
    }

    // ==================== Tests para Lista ====================

    @Test
    void testListaVacia() {
        Lista lista = new Lista();
        assertTrue(lista.estaVacia());
    }

    @Test
    void testAgregarEstudiante() {
        Lista lista = new Lista();
        Estudiante est = new Estudiante("1", "Juan");
        lista.agregarEstudiante(est);
        assertEquals(1, lista.obtenerCantidadEstudiantes());
    }

    @Test
    void testObtenerEstudiante() {
        Lista lista = new Lista();
        Estudiante est = new Estudiante("1", "Juan");
        lista.agregarEstudiante(est);
        assertEquals(est, lista.obtenerEstudiante(0));
    }

    @Test
    void testEliminarEstudiante() {
        Lista lista = new Lista();
        Estudiante est = new Estudiante("1", "Juan");
        lista.agregarEstudiante(est);
        lista.eliminarEstudiantePorIndice(0);
        assertTrue(lista.estaVacia());
    }
}

