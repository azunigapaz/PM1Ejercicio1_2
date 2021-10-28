package com.grupoadec.pm1ejercicio1_2.models;

public class persona {
    String nombres;
    String apellidos;
    int edad;
    String corre;

    public persona(String nombres, String apellidos, int edad, String corre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.corre = corre;
    }

    public persona(){};

    public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public String getCorre() {return corre;}

    public void setCorre(String corre) {this.corre = corre;}
}
