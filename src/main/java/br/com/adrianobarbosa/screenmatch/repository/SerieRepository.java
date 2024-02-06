package br.com.adrianobarbosa.screenmatch.repository;

import br.com.adrianobarbosa.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}