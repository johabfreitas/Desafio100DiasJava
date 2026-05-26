package com.desafio100diasjava.oneday;

import java.util.Scanner;

/*
* Desafio de concatenação
* */

public class Exercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String cidade;

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); //limpa o buffer. Depois de nextInt(), sobra uma quebra de linha no buffer.
        System.out.println("Digite a cidade onde mora: ");
        cidade = sc.nextLine();

        System.out.println(String.format("Olá %s, você tem %d anos e mora em %s", nome, idade, cidade));




        sc.close();
    }
}