/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practico_2_lab;

/**
 *
 * @author Lucia
 */
public class Practico_2_lab {

    public static void main(String[] args) {
        
          Reloj relojNormal = new Reloj(12, 30, 45);

        Persona unaPersona = new Persona("Juan", relojNormal);

        System.out.println("La hora del reloj de "+ unaPersona.getNombre()+ " es: "+ unaPersona.getReloj());

        RelojFit relojFit = new RelojFit(14, 45, 30);

        unaPersona.setReloj(relojFit);


        relojFit.cuentaPasos(3, 4);
        System.out.println("Pasos contados: "+ relojFit.getPasos());

        relojFit.frecuenciaAleatoria();
    }
    }
    

}
