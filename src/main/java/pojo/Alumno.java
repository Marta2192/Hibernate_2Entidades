package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Alumno {
	
	@Id
	String dni;
	@Column
	String nombre;
	@Column
	int telefono;
	//Relación 1 a 1
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codExp", foreignKey = @ForeignKey(foreignKeyDefinition = "fk_exp"))
	Expediente expediente;
	
	public Alumno(String dni, String nombre, int telefono, Expediente expediente) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.expediente = expediente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Expediente getExpediente() {
		return expediente;
	}
	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}
	
	
	
	
	
}
