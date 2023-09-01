/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author manue
 */
public class Jugador {
    private String nombre;
    private Baraja carta;

    public Jugador() {
    }

    public Jugador(String nombre, Baraja carta) {
        this.nombre = nombre;
        this.carta = carta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Baraja getCarta() {
        return carta;
    }

    public void setCarta(Baraja carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", carta=" + carta + '}';
    }
    
    
}
