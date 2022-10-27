package com.programacion.quintasemana;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        Scanner calculadora2 = new Scanner(System.in);

        System.out.println("Introduce 2 numeros ");
        float valor1;
        float valor2;
        float resultado;
        valor1= calculadora.nextInt();
        valor2= calculadora.nextInt();
        System.out.println("Que opercion quieres realizar? suma(+),resta(-),multiplicacion(*) o division(/)");
        String operacion= calculadora2.nextLine();

        if (operacion.contains("+")){
            resultado= valor1+valor2;
            System.out.println("El restultado es " + resultado);

        } else if (operacion.contains("-")) {
            resultado= valor1-valor2;
            System.out.println("El restultado es " + resultado);

        } else if (operacion.contains("*")) {
            resultado= valor1*valor2;
            System.out.println("El restultado es " + resultado);


        } else if (operacion.contains("/")) {
            resultado=valor1/valor2;
            System.out.println("El restultado es " + resultado);

        }
        else {
            System.out.println("No has introducido ningun valor");
        }
    }
}
