package hn.unah.lenguajes.creditos.creditos.modelos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "prestamos")
public class Prestamos {

    @Id
    @Column(name = "codigoprestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoPrestamo;

    @Column(name = "fechaapertura")
    private Date fechaApertura;

    private Double monto;

    private Double cuota;

    private long plazo;

    private Double interes;

    //foreing key
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoprestamo", referencedColumnName = "dni")
    private Clientes cliente;

    
}
