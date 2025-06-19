package com.proyectoPaginaWeb.PaginaWeb.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoPaginaWeb.PaginaWeb.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

