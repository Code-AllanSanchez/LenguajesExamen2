package hn.unah.lenguajes.creditos.creditos.servicios;

import org.springframework.stereotype.Service;

import hn.unah.lenguajes.creditos.creditos.modelos.Prestamos;
import hn.unah.lenguajes.creditos.creditos.repositorios.PrestamosRepositorio;

@Service
public class PrestamosServicio {

    private PrestamosRepositorio prestamosRepositorio;

    public Prestamos buscarPorId(long id){
        return this.prestamosRepositorio.findById(id).get();
    }
    
}
