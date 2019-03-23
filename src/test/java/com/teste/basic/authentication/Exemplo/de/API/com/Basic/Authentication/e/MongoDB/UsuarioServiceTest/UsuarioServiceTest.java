package com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.UsuarioServiceTest;

import com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.model.Usario;
import com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.repository.UsuarioRepositor;
import com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.service.UsarioService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioServiceTest {

    @Mock
    private UsuarioRepositor usuarioRepositor;

    @InjectMocks
    private UsarioService usarioService;

    @Test
    public void deveVerificarSeExisteUsuarioCadastrado() {
        Mockito.when(usuarioRepositor.findByEmail("teste@hotmail")).thenReturn(new Usario.Builder().setId("1")
                                                                                      .setEmail("teste@hotmail")
                                                                                      .setSenha("123")
                                                                                      .newInstance());

        Assert.assertEquals("teste@hotmail", usarioService.loadUserByUsername("teste@hotmail").getUsername());
    }
}
