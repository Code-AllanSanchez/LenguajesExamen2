package hn.unah.lenguajes.creditos.creditos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.creditos.creditos.modelos.Prestamos;

@Repository
public interface PrestamosRepositorio extends JpaRepository<Prestamos, Long> {
    
}
