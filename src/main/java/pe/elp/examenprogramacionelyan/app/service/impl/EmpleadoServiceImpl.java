package pe.elp.examenprogramacionelyan.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pe.elp.examenprogramacionelyan.app.mapper.EmpleadoMapper;
import pe.elp.examenprogramacionelyan.app.model.EmpleadoEntity;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoRequest;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoResponse;
import pe.elp.examenprogramacionelyan.app.repository.EmpleadoRepository;
import pe.elp.examenprogramacionelyan.app.service.EmpleadoService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<EmpleadoResponse> findAllEmpleados() {
        return empleadoRepository.findAll()
                .stream().map(EmpleadoMapper::toDto).collect(Collectors.toList());

    }

    @Override
    public void saveEmpleados(EmpleadoRequest request) {
        EmpleadoEntity empleado = EmpleadoMapper.toEntity(request);
        empleadoRepository.save(empleado);

    }

    @Override
    public void deleteEmpleado(Long id) {
        if (empleadoRepository.existsById(id)) {
            empleadoRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"error al eliminar el empleado");

        }
    }

    @Override
    public void updateEmpleado(Long id, EmpleadoRequest request) {
        empleadoRepository.findById(id).map(
                emplEx -> {
                    emplEx.setNombre(request.nombre());
                    emplEx.setPuesto(request.puesto());
                    emplEx.setSalario(request.salario());
                    emplEx.setDepartamento(request.departamento());
                    emplEx.setFechaContratacion(request.fechaContratacion());
                    emplEx.setUltimaModificacion(request.ultimaModificacion());
                     empleadoRepository.save(emplEx);
                     return "Actualizado";
                }
        ).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"error al eliminar el empleado"));

    }
}
