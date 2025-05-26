package pe.elp.examenprogramacionelyan.app.service;

import org.springframework.stereotype.Service;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoRequest;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoResponse;

import java.util.List;

@Service
public interface EmpleadoService {

    List<EmpleadoResponse> findAllEmpleados();

    void saveEmpleados(EmpleadoRequest request);

    void deleteEmpleado(Long id);

    void updateEmpleado(Long id, EmpleadoRequest request);
}
