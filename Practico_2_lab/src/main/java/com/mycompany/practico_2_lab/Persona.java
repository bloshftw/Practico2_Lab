
package com.mycompany.practico_2_lab;
public class Persona {
    private String nombre;
    private Reloj reloj;
    private String apellido;
    private int edad;
    private float altura;

    public Persona(String nombre, Reloj reloj, String apellido, int edad, float altura) {
        this.nombre = nombre;
        this.reloj = reloj;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    public void mostrarDatos () {
    
        System.out.println("Nombre de la persona: " + getNombre());
        System.out.println("Apellido de la persona: " + getApellido());
        System.out.println("Altura de la Persona: " + getAltura());
        System.out.println("Edad de la persona: " + getEdad());
    
    }
    
    
    
}



   
    

