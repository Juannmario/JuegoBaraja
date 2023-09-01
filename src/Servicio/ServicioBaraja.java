
package Servicio;

import Entidades.Baraja;
import java.util.Random;

public class ServicioBaraja {
    Baraja baraja[];
    

    public void crearBaraja()
    {
        baraja = new Baraja[Baraja.cantidad];
        Baraja.setPosCarta(0);
       
        int pos;   
           for(int i=0;i<4;i++)
           {
               for(int j=0;j<10;j++)
               {
                  pos = j+i*10;
                 baraja[pos]=new Baraja();  
                 baraja[pos].setPalo(Baraja.palos[i]);
                 baraja[pos].setNumero(Baraja.numeros[j]);
               }
           }
    }
  

    public void mezclar()
    {
        int posAleatoria;
        Baraja c;
        Random random = new Random();
        for (int i = 0; i <baraja.length;i++)
        {
            posAleatoria = random.nextInt(40);
            c=baraja[i];
            baraja[i]=baraja[posAleatoria];
            baraja [posAleatoria] = c;
        }
                 
    }

    public Baraja siguienteCarta()
    {
        Baraja c =null ;
        int pos = Baraja.getPosCarta();
        if(pos==Baraja.cantidad)
        {
            System.out.println("NO HAY MAS CARTAS, MEZCLA OTRA VEZ");
        }
        else
        {
             c=baraja[pos];
             Baraja.setPosCarta(pos+1);
        }
        return c;
    }

    public int cartasDisponibles()
    {
        return Baraja.cantidad-Baraja.getPosCarta();
    }
  
    public Baraja[] darCartas(int cant)
    {
        Baraja cartas[] = new Baraja[cant];
        int pos=Baraja.getPosCarta();
 
        if(Baraja.cantidad-pos<cant)
        {
            System.out.println("No hay esa cantidad de cartas disponibles");
            
            return null;
        }
        else {
            
         for (int i = 0;i<cant;i++)
            {
            cartas[i]= siguienteCarta();
           
             
            }
        }
        return cartas;
    }
    
 
    public void monton()
    {
        
        for(int i = 0; i<Baraja.getPosCarta();i++)
        {
            System.out.println(baraja[i]);
        }
        if(Baraja.getPosCarta()==0)
        {
              System.out.println("NO HAY CARTAS EN EL MONTON");
        }
    }
    
    
    public void mostrarBaraja()
    {
        for (int i =0;i<Baraja.cantidad-Baraja.getPosCarta();i++)
        {
            System.out.println(baraja[i]);
        }
        
    }     
}
