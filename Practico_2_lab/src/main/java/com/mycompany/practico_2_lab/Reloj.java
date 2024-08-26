
package com.mycompany.practico_2_lab;
public class Reloj {
 
 private String dia;
 private String hora;
 private String modelo;
 private Long numSerie;
 private Double frecuencia;

    public Reloj(String dia, String hora, String modelo, Long numSerie, Double frecuencia) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.frecuencia = frecuencia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumSerie(Long numSerie) {
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getModelo() {
        return modelo;
    }

    public Long getNumSerie() {
        return numSerie;
    }

    public Double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Double frecuencia) {
        this.frecuencia = frecuencia;
    }
 
   

 
   /*METODOS*/

    public void incrementarDia() {
        switch(dia.toLowerCase()) {
            case "lunes":
                dia = "martes";
                break;
            case "martes":
                dia = "miércoles";
                break;
            case "miércoles":
                dia = "jueves";
                break;
            case "jueves":
                dia = "viernes";
                break;
            case "viernes":
                dia = "sábado";
                break;
            case "sábado":
                dia = "domingo";
                break;
            case "domingo":
                dia = "lunes";
                break;
            default:
                dia = "lunes";
                break;
        }
    }
    
    
    public void incrementarHora() {
        String[] partes = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        horas += 1;
        if (horas == 24) {
            horas = 0;
            incrementarDia(); 
        }

        hora = String.format("%02d:%02d", horas, minutos);
    }

    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    
    public void frecuenciaAleatoria(){
   
    }
    
    public void cuentaPasos (int x, int y){
    
    }
    
    
}
    
    



