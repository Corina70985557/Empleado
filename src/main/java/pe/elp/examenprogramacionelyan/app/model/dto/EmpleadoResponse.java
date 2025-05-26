package pe.elp.examenprogramacionelyan.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
    
    
}
