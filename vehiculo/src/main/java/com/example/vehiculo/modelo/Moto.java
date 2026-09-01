package com.example.vehiculo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "moto")

public class Moto {
// campos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @Column(name = "cilindrada")
    private int cilindrada;

    // constructores
    public Moto() {
    }

    public Moto(Vehiculo vehiculo, int cilindrada) {
        this.vehiculo = vehiculo;
        this.cilindrada = cilindrada;
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
