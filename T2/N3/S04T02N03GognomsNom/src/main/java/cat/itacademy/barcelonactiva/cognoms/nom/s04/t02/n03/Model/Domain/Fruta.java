package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.Model.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int cantidadKilos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadKilos() {
        return cantidadKilos;
    }

    public void setCantidadKilos(int cantidadKilos) {
        this.cantidadKilos = cantidadKilos;
    }

}
