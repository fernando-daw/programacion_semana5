package com.programacion.quintasemana;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner parametro= new Scanner(System.in);
        System.out.println("Introduce 2 numeros ");
        int num1= parametro.nextInt();
        int num2= parametro.nextInt();
        boolean resultado;
        if (resultado= num1 % num2 == 0){
            System.out.println("Los numeros introducidos son multiplos");

        }
        else {
            System.out.println("Los numeros no son multiplos");
        }



    }
}
