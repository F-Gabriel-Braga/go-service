package io.github.fgabrielbraga.goservicedev.repository;

import io.github.fgabrielbraga.goservicedev.domain.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Long> {

    Optional<Prestador> findByEmail(String email);

    @Query(value =
            "SELECT u.*" +
            " FROM usuarios u" +
            " JOIN prestadores_servicos p ON u.id = p.prestador_id" +
            " JOIN servicos s ON s.id = p.servico_id" +
            " WHERE s.id = ?", nativeQuery = true)
    List<Prestador> findByServicoId(Long id);
}
