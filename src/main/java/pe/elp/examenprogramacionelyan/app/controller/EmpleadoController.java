package pe.elp.examenprogramacionelyan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoRequest;
import pe.elp.examenprogramacionelyan.app.model.dto.EmpleadoResponse;
import pe.elp.examenprogramacionelyan.app.service.EmpleadoService;

import java.util.List;

@RestController
@RequestMapping("/v1/evaluacion")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/insertar")
    public ResponseEntity<String> insertar(@RequestBody EmpleadoRequest request){
        empleadoService.saveEmpleados(request);
        return ResponseEntity.ok("insertado con exito");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<EmpleadoResponse>> listar(){
        return ResponseEntity.ok(empleadoService.findAllEmpleados());
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizar(@PathVariable Long id, @RequestBody EmpleadoRequest request){
        try {
            empleadoService.updateEmpleado(id, request);
            return ResponseEntity.ok("actualizado con exito");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        try {
            empleadoService.deleteEmpleado(id);
            return ResponseEntity.ok("eliminado con exito");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
