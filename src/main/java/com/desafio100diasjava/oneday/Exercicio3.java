package com.desafio100diasjava.oneday;
/*
* Desafio do IMC
* */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso: ");
        Double peso = sc.nextDouble();

        System.out.println("Altura: ");
        Double altura = sc.nextDouble();

        Double imc = peso / (altura * altura);
        System.out.println(String.format("O IMC: %.2f", imc));

        sc.close();
        System.out.println("Resultado final!");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
