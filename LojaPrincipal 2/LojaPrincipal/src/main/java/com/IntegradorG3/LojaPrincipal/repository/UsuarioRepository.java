package com.IntegradorG3.LojaPrincipal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IntegradorG3.LojaPrincipal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase(String nomeCompleto);
}
