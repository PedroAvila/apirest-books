package com.company.books.backend.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.company.books.backend.model.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	Usuario findByUsuario(String nombre);
	
	@Query("select u from Usuario u where u.nombre=?1")
	Usuario findByIdUsuarioV2(String nombre);
}
