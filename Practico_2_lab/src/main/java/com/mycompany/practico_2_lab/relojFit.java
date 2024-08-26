
package com.mycompany.practico_2_lab;

import java.util.Random;

public class relojFit extends Reloj {

    public relojFit(String dia, String hora, String modelo, Long numSerie, Double frecuencia) {
        super(dia, hora, modelo, numSerie, frecuencia);
    }

 
    /*METODOS*/
    
    @Override
    public void cuentaPasos (int x, int y){
   
       int pasos = x + y;
        
        System.out.println(pasos);
    }
    
    @Override
    public void frecuenciaAleatoria() {
    
        int frecuenciaActual;
        
        frecuenciaActual = (int) (50 + Math.random() * 100); 
        System.out.println(frecuenciaActual);
        
    }
    
}
    
    


    
