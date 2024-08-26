/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practico_2_lab;

/**
 *
 * @author Lucia
 */
public class Persona {
    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }
    
}
