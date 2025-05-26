package pe.elp.examenprogramacionelyan.app.model;


//Atributos: id, nombre, puesto, salario, departamento, fechaContratacion,
//fechaCreacion,
//ultimaModificacion


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String puesto;
    private Double salario;
    private String departamento;
    private String fechaContratacion;
    private LocalDateTime fechaCreacion;
    private String ultimaModificacion;

    @PrePersist
    public void PrePersist(){
        if (this.fechaCreacion == null){
            this.fechaCreacion = LocalDateTime.now().withSecond(0).withNano(0);
        }
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(String ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}
    
    

}
