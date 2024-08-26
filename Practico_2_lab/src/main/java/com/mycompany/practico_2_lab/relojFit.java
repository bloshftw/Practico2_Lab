
package com.mycompany.practico_2_lab;

import java.util.Random;

public class relojFit extends Reloj {
    private int pasos;

    public relojFit(int frecuencia) {
        super(frecuencia);
        this.pasos = 0;
    }

    public void cuentaPasos(int x, int y) {
        pasos += Math.abs(x) + Math.abs(y);
        System.out.println("Pasos contados: " + pasos);
    }

    public void frecuenciaAleatoria() {
        Random rand = new Random();
        int nuevaFrecuencia = rand.nextInt(200) + 40; 
        setFrecuencia(nuevaFrecuencia);
        System.out.println("Frecuencia aleatoria establecida: " + nuevaFrecuencia);
    }

    public int getPasos() {
        return pasos;
    }
}