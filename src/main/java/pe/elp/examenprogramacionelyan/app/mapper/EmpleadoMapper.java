package pe.elp.examenprogramacionelyan.app.mapper;

import org.springframework.stereotype.Component;
import pe.elp.examenprogramacionelyan.app.model.EmpleadoEntity;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoRequest;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoResponse;

@Component
public class EmpleadoMapper {

    public static EmpleadoResponse toDto(EmpleadoEntity empleado) {
        return new EmpleadoResponse(
                empleado.getNombre(),
                empleado.getPuesto(),
                empleado.getSalario(),
                empleado.getDepartamento(),
                empleado.getFechaCreacion());
    }

    public static EmpleadoEntity toEntity(EmpleadoRequest request) {
        EmpleadoEntity empleado = new EmpleadoEntity();
        empleado.setNombre(request.nombre());
        empleado.setPuesto(request.puesto());
        empleado.setSalario(request.salario());
        empleado.setDepartamento(request.departamento());
        empleado.setFechaContratacion(request.fechaContratacion());
        empleado.setUltimaModificacion(request.ultimaModificacion());
        return empleado;
    }
}
