    package com.desafio100diasjava.oneday;

    import java.util.Scanner;
/*
* Desafio dos operadores aritméticos
* */
    public class Exercicio2 {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           double numero1;
           double numero2;

           System.out.println("Número 1: ");
           numero1 = sc.nextDouble();

           System.out.println("Número 2: ");
           numero2 = sc.nextDouble();

           System.out.println("------SOMA------");
           double resultadoSoma = numero1 + numero2;
           System.out.println(String.format("A soma é: %.0f", resultadoSoma));

           System.out.println("------SUBTRAÇÃO------");
           double resultadoSub = numero1 - numero2;
           System.out.println(String.format("A subtração é: %.0f", resultadoSub));

           System.out.println("------MULTIPLICAÇÃO------");
           double resultadoMulti = numero1 * numero2;
           System.out.println(String.format("A multiplicação é: %.0f", resultadoMulti));

           System.out.println("------DIVISÃO------");
           double resultadoDiv = numero1 / numero2;
           System.out.println(String.format("A divisão é: %.0f", resultadoDiv));

           sc.close();
        }
    }
