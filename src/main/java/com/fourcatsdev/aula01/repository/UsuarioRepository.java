package com.fourcatsdev.aula01.repository;


import com.fourcatsdev.aula01.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
