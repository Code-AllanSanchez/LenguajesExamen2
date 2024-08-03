package hn.unah.lenguajes.creditos.creditos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.creditos.creditos.modelos.Prestamos;

public interface PrestamosRepositorio extends JpaRepository<Prestamos, Long> {
    
}
