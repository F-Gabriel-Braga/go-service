package io.github.fgabrielbraga.goservicedev.domain;

import io.github.fgabrielbraga.goservicedev.domain.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Administrador extends Usuario {

    public Administrador() {
        super();
        setPerfil(Perfil.ADMIN);
    }

    public Administrador(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado) {
        super(id, nome, email, senha, perfil, habilitado);
    }
}
