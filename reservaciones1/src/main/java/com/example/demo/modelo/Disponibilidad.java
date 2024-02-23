package com.example.demo.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "disponibilidad")
public class Disponibilidad {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_disponibilidad;
	    private LocalTime hora_salida;
	    private LocalDate fecha;
	    private int cantidad_disponible;
	    @ManyToOne
	    @JoinColumn(name = "id_automovil")
	    private Automovil automovil;
}
