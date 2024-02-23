package com.example.demo.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
	@Column (name = "Nombre")
    private String nombre;
	@Column (name = "Apellidos")
    private String apellidos;
	@Column (name = "Cedula")
    private String cedula;
	@Column (name = "Telefono")
    private String telefono;
	@Column (name = "Fehca_Nacimiento")
    private LocalDate fecha_nacimiento;
	
	public Usuarios(Long id_usuario, String nombre, String apellidos, String cedula, String telefono,
			LocalDate fecha_nacimiento) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	

}
