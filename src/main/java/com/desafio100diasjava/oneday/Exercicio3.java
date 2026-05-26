package com.desafio100diasjava.oneday;

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
    }
}
