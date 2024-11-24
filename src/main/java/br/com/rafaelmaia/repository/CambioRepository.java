package br.com.rafaelmaia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelmaia.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);
}
