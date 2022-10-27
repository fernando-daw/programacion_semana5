package com.programacion.quintasemana;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int valor_usuario;
        int sum = 0;
        int contador;
        float media;
        Scanner numeros = new Scanner(System.in);
        Scanner cantidad_numeros = new Scanner(System.in);
        System.out.println("Ingresa el número total de términos que quieres que calcule la media");

        contador = numeros.nextInt();

        System.out.println("Por favor ingresa " + contador + " números:");

        for(int i = 1; i<=contador ;i++){
            valor_usuario = numeros.nextInt();
            sum = sum + valor_usuario;
            System.out.println();
        }

        media = sum / contador;
        System.out.println("La media de " + contador + " los números que ingresaste es " + media);
    }
    }

