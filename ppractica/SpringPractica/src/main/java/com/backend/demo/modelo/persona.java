package com.backend.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="persona")
public class persona {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_persona;
	@Column
	private int rut;
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private String Correo;
	@Column
	private int telefono;
	@Column
	private String password;
	
	public int getId() {
		return id_persona;
	}
	public void setId(int id_persona) {
		this.id_persona = id_persona;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		this.Correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public persona(int id_persona, int rut, String nombre, String apellidos, String correo, int telefono, String password) {
		super();
		this.id_persona = id_persona;
		this.rut = rut;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.Correo = correo;
		this.telefono = telefono;
		this.password = password;
	}

}
