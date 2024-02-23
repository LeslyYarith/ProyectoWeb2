package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Reservacion;

public interface RepositorioReservacion  extends JpaRepository<Reservacion, Long>{

}
