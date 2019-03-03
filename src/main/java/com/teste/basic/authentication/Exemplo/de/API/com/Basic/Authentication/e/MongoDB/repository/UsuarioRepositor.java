package com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.repository;

import com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.model.Usario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositor extends MongoRepository<Usario, String> {

    Usario findByEmail(String email);
}
