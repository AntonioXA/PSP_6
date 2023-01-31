package com.example.PSP_6.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

/**
 * Clase que representa a un estudiante.
 *
 */
@Entity
@Table(name = "estudiantes")
public class Estudiantes {
	
	/** SERIAL ID */
	private static final long serialVersionUID = 1L;
	
	/** Identificador del estudiante (PK) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String dni;
	
	/** Nombre del estudiante */
	@Size(max=20)
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	/** Direccion del estudiante */
	@Size(max=30)
	@Column(name = "Direccion", nullable = false)
	private String direccion;

	/** Carrera del estudiante */
	@Size(max=30)
	@Column(name = "Carrera", nullable = false)
	private String carrera;
	
	/** Año de estudio del estudiante */
	@Size(max=4)
	@Column(name = "Año de estudio", nullable = false)
	private int anio;
	
	/** Habilidades del estudiante */
	@Size(max=200)
	@Column(name = "Habilidades", nullable = false)
	private String habilidades;
	
	/** Telefono del estudiante */
	@Size(max=9)
	@Column(name = "Telefono", nullable = false)
	private int telefono;
	
	/** Correo del estudiante */
	@Size(max=30)
	@Column(name = "Correo", nullable = false)
	private String correo;
	
	/** Perfil Linkedin del estudiante */
	@Size(max=60)
	@Column(name = "Linkedin", nullable = false)
	private String linkedin;
}
