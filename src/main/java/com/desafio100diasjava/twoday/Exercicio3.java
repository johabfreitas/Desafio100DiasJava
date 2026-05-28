package com.desafio100diasjava.twoday;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 0;
        System.out.println("Numero 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int numero2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Escolha um operador: (+, -, *, /) ");
        String operador = sc.nextLine();

        if(operador.equals("+")){
            resultado = numero1 + numero2;
            System.out.println("Soma é: " + resultado);
        }
        if(operador.equals("-")){
            resultado = numero1 - numero2;
            System.out.println("Subtração é: " + resultado);
        }
        if(operador.equals("*")){
            resultado = numero1 * numero2;
            System.out.println("Multiplicação é: " + resultado);
        }
        if(operador.equals("/")){
            if(numero1 != 0 || numero2 != 0){
                System.out.println("Não é possível divisão por Zero!");
            }
            else {
                resultado = numero1 / numero2;
                System.out.println("Divisão é: " + resultado);
            }
        }
        else {
            System.out.println("Operador inválido!");
        }
        sc.close();
    }
}
