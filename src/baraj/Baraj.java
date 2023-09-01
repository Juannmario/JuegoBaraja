
package baraj;

import Servicio.ServicioBaraja;



public class Baraj {

    public static void main(String[] args) {
        
        ServicioBaraja baraja = new ServicioBaraja();
        baraja.crearBaraja();
        baraja.mezclar();
        
        
    }
    
}
