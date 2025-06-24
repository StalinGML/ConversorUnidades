package com.mycompany.tiposdedatos_identificadores;

/*
 * Programa: Conversor de unidades de longitud
 * Autor: Stalin Mendieta
 * Descripción: Este programa solicita al usuario una cantidad en metros
 *              y la convierte a centímetros, milímetros, kilómetros, pulgadas, pies y yardas.
 */

import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {
        
        // Encabezado
        System.out.println("========================================");
        System.out.println("    CONVERSOR DE UNIDADES DE LONGITUD   ");
        System.out.println("          Autor: Stalin Mendieta         ");
        System.out.println("========================================\n");
        
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner entrada_usuario = new Scanner(System.in);

        // Declaración de variables
        float valor_metros;
        float valor_centimetros;
        float valor_milimetros;
        float valor_kilometros;
        float valor_pulgadas;
        float valor_pies;
        float valor_yardas;
        boolean entrada_valida = true;
        String mensaje_resultado;

        // Solicitar al usuario la cantidad en metros
        System.out.print("Ingrese una distancia en metros: ");
        valor_metros = entrada_usuario.nextFloat();

        // Validar que el valor ingresado sea positivo
        if (valor_metros <= 0) {
            entrada_valida = false;
            mensaje_resultado = "Error: El valor debe ser mayor a cero.";
        } else {
            // Realizar las conversiones
            valor_centimetros = valor_metros * 100;
            valor_milimetros = valor_metros * 1000;
            valor_kilometros = valor_metros / 1000;
            valor_pulgadas = valor_metros * 39.3701f;
            valor_pies = valor_metros * 3.28084f;
            valor_yardas = valor_metros * 1.09361f;

            // Preparar el mensaje con los resultados
            mensaje_resultado = "\nConversión de " + valor_metros + " metros:\n";
            mensaje_resultado += "- Kilómetros: " + valor_kilometros + " km\n";
            mensaje_resultado += "- Metros: " + valor_metros + " m\n";
            mensaje_resultado += "- Centímetros: " + valor_centimetros + " cm\n";
            mensaje_resultado += "- Milímetros: " + valor_milimetros + " mm\n";
            mensaje_resultado += "- Pulgadas: " + valor_pulgadas + " in\n";
            mensaje_resultado += "- Pies: " + valor_pies + " ft\n";
            mensaje_resultado += "- Yardas: " + valor_yardas + " yd";

        }

        // Mostrar resultados o error
        System.out.println(mensaje_resultado);
    
    }
    
}
