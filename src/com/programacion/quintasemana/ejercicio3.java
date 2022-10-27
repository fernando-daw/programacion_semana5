package com.programacion.quintasemana;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner cadena= new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres");
        String letras = cadena.nextLine();
        for (int i=0;i<letras.length();i++){
            System.out.println(letras.charAt(i));
        }
    }
}
