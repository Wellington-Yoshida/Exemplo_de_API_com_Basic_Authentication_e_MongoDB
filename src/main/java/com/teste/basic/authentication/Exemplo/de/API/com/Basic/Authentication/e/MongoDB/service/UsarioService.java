package com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.service;

import com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.model.Usario;
import com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.repository.UsuarioRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class UsarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepositor usuarioRepositor;

    public Usario findByEmail(String email) {
        return  usuarioRepositor.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Usario usario = usuarioRepositor.findByEmail(s);
        if (ObjectUtils.isEmpty(usario)) {
            throw new UsernameNotFoundException("Usuario não encontrado.");
        }
        return usario;
    }
}
