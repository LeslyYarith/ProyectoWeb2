package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Usuarios;

public interface RepositorioUsuarios  extends JpaRepository<Usuarios, Long>{

}
