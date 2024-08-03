package hn.unah.lenguajes.creditos.creditos.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.creditos.creditos.modelos.Prestamos;
import hn.unah.lenguajes.creditos.creditos.servicios.PrestamosServicio;



@RestController
@RequestMapping("/api/prestamos")
public class PrestamoControlador {
    
    @Autowired
    private PrestamosServicio prestamoServicio;

    @GetMapping("/obtenerprestamo/{id}")
    public Prestamos obtenerPrestamo(@PathVariable(name = "id") long id) {
        return this.prestamoServicio.buscarPorId(id);
    }
    


}
