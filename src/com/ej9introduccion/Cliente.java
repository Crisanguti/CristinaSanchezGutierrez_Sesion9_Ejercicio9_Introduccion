package com.ej9introduccion;

public class Cliente extends Persona{
    float credito;

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
