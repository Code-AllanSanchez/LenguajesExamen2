package hn.unah.lenguajes.creditos.creditos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.creditos.creditos.modelos.Clientes;
import hn.unah.lenguajes.creditos.creditos.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Clientes> obtenerTodos(){
        return this.clienteRepositorio.findAll();
    }

    public Clientes nuevoCliente(Clientes nuevoCliente){

        if(this.clienteRepositorio.existsById(nuevoCliente.getDni())){
            
        }
        return nuevoCliente;
    }
    
}
