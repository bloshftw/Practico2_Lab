
package com.mycompany.practico_2_lab;

public class Practico_2_lab {

    /*INTEGRANDES: */
    /// Luciano Jesus Rodriguez DNI: 43123899
    /// Fernando Grabobi DNI: 43222114
    /// Milena Miselli DNI: 44164036
    /// Martin Perez DNI: 44020159
    /// Villegas Maria Lourdes DNI:46332709
    
    
    public static void main(String[] args) {
        
        relojFit casio = new relojFit("Lunes","17:12","Rolex",0241L,50.0);
        
        
        
       Persona Milena = new Persona("Milena",casio,"Miselli",22,170);
       
       Milena.mostrarDatos();
       
       /*FUNCION MOSTRAR DIA E INCREMENTAR*/
      System.out.println(Milena.getReloj().getDia());
      Milena.getReloj().incrementarDia();
       System.out.println(Milena.getReloj().getDia());
       
       /*FUNCION MOSTRAR HORA E INCREMENTAR*/
        System.out.println(Milena.getReloj().getHora());
        Milena.getReloj().incrementarHora();
        System.out.println(Milena.getReloj().getHora());

       /*MODELO Y FRECUENCIA*/
        System.out.println("Modelo del reloj: " + Milena.getReloj().getModelo());
        System.out.println("Frecuencia actual: " + Milena.getReloj().getFrecuencia());
        
       /*FRECUENCIA ALEATORIA*/
       
        
       
       /*CUENTA PASOS*/
       
       Milena.getReloj().frecuenciaAleatoria();
       Milena.getReloj().cuentaPasos(5, 5);
    }
    

}
