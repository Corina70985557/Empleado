package pe.elp.examenprogramacionelyan.app.model.dto;

public record EmpleadoRequest(
        String nombre,
        String puesto,
        Double salario,
        String departamento,
        String fechaContratacion,
        String ultimaModificacion
)

{
}
