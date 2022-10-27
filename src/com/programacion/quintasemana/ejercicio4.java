package com.programacion.quintasemana;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner cuadrado= new Scanner(System.in);
    int lado;
    int altura;
    int calculoArea;
    System.out.println("Introduce los valores de LADO y la ALTURA para calcular el area del cuadrado");
    lado= cuadrado.nextInt();
    altura= cuadrado.nextInt();
    calculoArea=lado*altura;
        System.out.println("El area del cuadrado es " + calculoArea);

    }
}
