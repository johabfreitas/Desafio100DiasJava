package com.desafio100diasjava.twoday;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        if(idade >= 60){
            System.out.println("Idoso");
        }
        else if (idade <= 59 && idade >= 18) {
            System.out.println("Adulto");
        } else if (idade <= 17 && idade >= 13) {
            System.out.println("Adolescente");
        }
        else {
            System.out.println("Criança");
        }


        sc.close();
    }
}
