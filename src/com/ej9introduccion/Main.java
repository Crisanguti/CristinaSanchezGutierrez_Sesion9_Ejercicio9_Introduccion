package com.ej9introduccion;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Trabajador trabajador1 = new Trabajador();

        cliente1.nombre = "Esteban";
        cliente1.edad = 43;
        cliente1.telefono = 654987987;
        cliente1.credito = 450.50f;

        trabajador1.nombre = "Raúl";
        trabajador1.edad = 32;
        trabajador1.telefono = 654321321;
        trabajador1.salario = 1500.00f;

        System.out.println(cliente1.toString() + "");
        System.out.println(trabajador1.toString() + "");

    }
}
