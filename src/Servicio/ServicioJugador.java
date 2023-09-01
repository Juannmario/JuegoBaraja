/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Baraja;
import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author manue
 */
public class ServicioJugador {
    
    Jugador jugador;
    private final Scanner leer = new Scanner(System.in).useDelimiter("/n");
    public void cargarJugador()
    {
        System.out.println("INGRESE EL NOMBRE DEL JUGADOR");
        jugador.setNombre(leer.next());      
    }
    public void recibirCartas (Baraja[] cartas)
    {
        
    }
}
