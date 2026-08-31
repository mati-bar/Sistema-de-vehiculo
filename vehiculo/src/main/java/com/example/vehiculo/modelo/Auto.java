package com.example.vehiculo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "auto")

public class Auto {
// campos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @Column(name = "cantidad_puertas")
    private int cantidadPuertas;

    // constructores
    public Auto() {
    }

    public Auto(Vehiculo vehiculo, int cantidadPuertas) {
        this.vehiculo = vehiculo;
        this.cantidadPuertas = cantidadPuertas;
    }

// getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
