package hn.unah.lenguajes.creditos.creditos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.creditos.creditos.modelos.Clientes;

public interface ClienteRepositorio extends JpaRepository<Clientes, String>{
    
}
