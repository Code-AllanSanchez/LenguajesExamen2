package hn.unah.lenguajes.creditos.creditos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.creditos.creditos.modelos.Cuotas;

public interface CuotasRepositorio extends JpaRepository<Cuotas, Long> {
    
}
