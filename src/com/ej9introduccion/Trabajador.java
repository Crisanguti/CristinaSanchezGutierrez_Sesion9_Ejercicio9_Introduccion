package com.ej9introduccion;

public class Trabajador extends Persona{
    float salario;

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", salario=" + salario +
                '}';
    }
}
