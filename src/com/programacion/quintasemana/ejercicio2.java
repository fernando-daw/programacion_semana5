package com.programacion.quintasemana;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        System.out.println("Introduce 1 numero ");
        int valor= numero.nextInt();
        if (valor<100){
            int modulo=0;
            boolean esPrimo=false;
            for (int contador = 2; contador<valor;contador++){
                modulo = valor%contador;
                if (modulo==0){
                    esPrimo=true;
                    break;
                }
            }
            if (esPrimo){
                System.out.println( valor + " no es primo");
            }else {
                System.out.println( valor + " es primo");

            }

        }
        else{
            System.out.println("El numero introducido es mayor que 100 ");

        }

    }


}
