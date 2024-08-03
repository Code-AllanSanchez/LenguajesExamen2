package hn.unah.lenguajes.creditos.creditos.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.creditos.creditos.modelos.Clientes;
import hn.unah.lenguajes.creditos.creditos.servicios.ClienteServicio;



@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {
    
    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/obtener/todos")
    public List<Clientes> obtenerTodos() {
        return this.clienteServicio.obtenerTodos();
    }

    @PostMapping("/crear/cliente")
    public Clientes crearCliente(@RequestBody Clientes cliente) {
        
        return this.clienteServicio.nuevoCliente(cliente);
    }
    
    

}
