package com.example.PSP_6.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Clase que representa a una empresa.
 *
 */
@Entity
@Table(name = "empresa")
@Data @AllArgsConstructor @NoArgsConstructor
public class Empresa {
	/** SERIAL ID */
	private static final long serialVersionUID = 1L;
	
	/** Identificador de la empresa (PK) */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** Nombre de la empresa */
	@Size(max=30)
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	/** Direccion de la empresa */
	@Size(max=30)
	@Column(name = "Direccion", nullable = false)
	private String direccion;
	
	/** Sector de la empresa */
	@Size(max=20)
	@Column(name = "Direccion", nullable = false)
	private String sector;
	
	/** Numero de trabajadores de la empresa */
	@Size(max=4)
	@Column(name = "N_trabajadores", nullable = false)
	private int n_trabajadores;
	
	/** Telefono de la empresa */
	@Size(max=9)
	@Column(name = "Telefono", nullable = false)
	private int telefono;
	
	/** Correo electronico de la empresa */
	@Size(max=30)
	@Column(name = "Correo", nullable = false)
	private String correo;
	
	/** Pagina web de la empresa */
	@Size(max=40)
	@Column(name = "Web", nullable = false)
	private String web;

}
