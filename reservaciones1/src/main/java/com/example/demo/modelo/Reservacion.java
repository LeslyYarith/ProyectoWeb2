package com.example.demo.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservacion")
public class Reservacion {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_reserva;
	    @ManyToOne
	    @JoinColumn(name = "id_usuario")
	    private Usuarios usuario;
	    @ManyToOne
	    @JoinColumn(name = "id_disponibilidad")
	    private Disponibilidad disponibilidad;
	    @Column (name = "Fecha_Reserva")
	    private LocalDate fecha_reserva;
	    @Column (name = "Destino")
	    private String destino;
	    @Column (name = "Puesto_Asignado")
	    private int puesto_asignado;
	    @Column (name = "Total_Pagar")
	    private double total_pagar;
	    
		public Reservacion(Long id_reserva, Usuarios usuario, Disponibilidad disponibilidad, LocalDate fecha_reserva,
				String destino, int puesto_asignado, double total_pagar) {
			super();
			this.id_reserva = id_reserva;
			this.usuario = usuario;
			this.disponibilidad = disponibilidad;
			this.fecha_reserva = fecha_reserva;
			this.destino = destino;
			this.puesto_asignado = puesto_asignado;
			this.total_pagar = total_pagar;
		}

		public Long getId_reserva() {
			return id_reserva;
		}

		public void setId_reserva(Long id_reserva) {
			this.id_reserva = id_reserva;
		}

		public Usuarios getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuarios usuario) {
			this.usuario = usuario;
		}

		public Disponibilidad getDisponibilidad() {
			return disponibilidad;
		}

		public void setDisponibilidad(Disponibilidad disponibilidad) {
			this.disponibilidad = disponibilidad;
		}

		public LocalDate getFecha_reserva() {
			return fecha_reserva;
		}

		public void setFecha_reserva(LocalDate fecha_reserva) {
			this.fecha_reserva = fecha_reserva;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public int getPuesto_asignado() {
			return puesto_asignado;
		}

		public void setPuesto_asignado(int puesto_asignado) {
			this.puesto_asignado = puesto_asignado;
		}

		public double getTotal_pagar() {
			return total_pagar;
		}

		public void setTotal_pagar(double total_pagar) {
			this.total_pagar = total_pagar;
		}
	    
	    
	    
}
