package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*String mensaje = saludar ("Fernanda");
        System.out.println(mensaje);
        int resultado = suma(5,3);
        System.out.println(resultado);
        alerta ("Mensaje de prueba");*/

        //o
        //System.out.println(saludar("Fernanda"));

        /*System.out.println(Math.PI);
        double num1 = 13.75;
        double num2 = 23.12;

        System.out.println(Math.sqrt(num2));*/
        String mensaje1 = "Adiós!!!!";
        String mensaje2 = "adiós!!!!";
        //para saber cuáles operaciones están disponibles para una variable
        //puede escribirse la variable + . para que salga todo lo disponible

        System.out.println(mensaje2.length());
            //length nos devuelve el número de caracteres de un string
        System.out.println(mensaje1.compareTo(mensaje2));
            //compareTo devuelve un cero cuando son iguales
        System.out.println(mensaje1.equals(mensaje2));
            //equals compara dos strings y devuelve verdadero si son iguales
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));
            //equalsIgnoreCase compara don strings sin importar si
            //están en mayúsculas o minúsculas

        System.out.println(mensaje1.toUpperCase());
            //pone el string en mayúsculas
    }

    public static String saludar (String nombre) {
        return "Hola ¿Cómo estás, " + nombre + "?";
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void alerta (String mensaje) {
        //los métodos tipos void, no devuelven ningún valor,
        //ejecuta lo que tenga que ejecutar, pero no te regresa nada
        System.out.println(mensaje);
    }
}
