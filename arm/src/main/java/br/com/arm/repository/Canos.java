package br.com.arm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arm.model.Cano;

@Repository
public interface Canos extends JpaRepository<Cano, Long> {

}
