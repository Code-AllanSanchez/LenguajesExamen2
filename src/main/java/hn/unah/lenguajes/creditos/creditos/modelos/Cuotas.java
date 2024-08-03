package hn.unah.lenguajes.creditos.creditos.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cuotas")
public class Cuotas {

    @Id
    @Column(name = "codigocuota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoCuota;

    private long mes;

    private Double interes;

    private Double capital;

    private Double saldo;

    //foreing key
    private int codigoPrestamo;
    
}
