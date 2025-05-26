package pe.elp.examenprogramacionelyan.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmpleadoResponse {

    private String nombre;
    private String puesto;
    private Double salario;
    private String departamento;
    private LocalDateTime fechaCreacion;
    
    
    
	public EmpleadoResponse(String nombre, String puesto, Double salario, String departamento,
			LocalDateTime fechaCreacion) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
		this.departamento = departamento;
		this.fechaCreacion = fechaCreacion;
	}
	 String getNombre() {
		return nombre;
	}
	 void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 String getPuesto() {
		return puesto;
	}
	 void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	 Double getSalario() {
		return salario;
	}
	 void setSalario(Double salario) {
		this.salario = salario;
	}
	 String getDepartamento() {
		return departamento;
	}
	 void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	 LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	 void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
    
    
}
