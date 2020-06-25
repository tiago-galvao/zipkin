package br.com.tga.usuariocep.usuario.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.tga.usuariocep.usuario.client.GetCepUsuarioClientResponse;
import br.com.tga.usuariocep.usuario.client.UsuarioCepClient;
import br.com.tga.usuariocep.usuario.exception.UsuarioNotFound;
import br.com.tga.usuariocep.usuario.model.Usuario;
import br.com.tga.usuariocep.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioCepClient usuarioCepClient;

    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(Usuario usuario){
        GetCepUsuarioClientResponse usuarioClient = usuarioCepClient.getCep(usuario.getCep());
        usuario.setBairro(usuarioClient.getBairro());
        usuario.setComplemento(usuarioClient.getComplemento());
        usuario.setLocalidade(usuarioClient.getLocalidade());
        usuario.setLogradouro(usuarioClient.getLogradouro());
        usuario.setUf(usuarioClient.getUf());
        return usuarioRepository.save(usuario);
    }

    public ResponseEntity<Usuario> findById(Long id){
        Optional<Usuario> optional = usuarioRepository.findById(id);
        if(!optional.isPresent()){
          throw new UsuarioNotFound();
        }
        return ResponseEntity.ok(optional.get());
    }
}