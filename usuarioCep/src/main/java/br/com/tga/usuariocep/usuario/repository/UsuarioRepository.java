package br.com.tga.usuariocep.usuario.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tga.usuariocep.usuario.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}