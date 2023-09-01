
package Entidades;


public class Baraja {
    private int numero;
    private String palo;
    
    private static int posCarta;

   
   public static final int cantidad= 40;
   public static final String palos[]={"Basto","Espada","Oro","Copa"};
   public static final int numeros[] = {1,2,3,4,5,6,7,10,11,12};
   
   public Baraja() {
         
    }

    public static int getPosCarta() {
        return posCarta;
    }

    public static void setPosCarta(int posCarta) {
        Baraja.posCarta = posCarta;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

  

    @Override
    public String toString() {
        return "Baraja{" + "numero=" + numero + ", palo=" + palo  + '}';
    }
   


   
    
}
