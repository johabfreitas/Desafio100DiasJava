    package com.desafio100diasjava.oneday;

    import java.util.Scanner;
/*
* Desafio dos operadores aritméticos
* */
    public class Exercicio2 {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           Double numero1;
           Double numero2;

           System.out.println("Número 1: ");
           numero1 = sc.nextDouble();

           System.out.println("Número 2: ");
           numero2 = sc.nextDouble();

           System.out.println("------SOMA------");
           Double resultadoSoma = numero1 + numero2;
           System.out.println(String.format("A soma é: %.0f", resultadoSoma));

           System.out.println("------SUBTRAÇÃO------");
           Double resultadoSub = numero1 - numero2;
           System.out.println(String.format("A subtração é: %.0f", resultadoSub));

           System.out.println("------MULTIPLICAÇÃO------");
           Double resultadoMulti = numero1 * numero2;
           System.out.println(String.format("A multiplicação é: %.0f", resultadoMulti));

           System.out.println("------DIVISÃO------");
           Double resultadoDiv = numero1 / numero2;
           System.out.println(String.format("A divisão é: %.0f", resultadoDiv));

           sc.close();
        }
    }
