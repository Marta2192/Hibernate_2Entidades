package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Expediente {

	@Id
	int id;
	@Column
	int anho;
	@Column
	String centro;
	
	
	public Expediente(int id, int anho, String centro) {
		super();
		this.id = id;
		this.anho = anho;
		this.centro = centro;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAnho() {
		return anho;
	}


	public void setAnho(int anho) {
		this.anho = anho;
	}


	public String getCentro() {
		return centro;
	}


	public void setCentro(String centro) {
		this.centro = centro;
	}
	
	
	
	
	
	
}
