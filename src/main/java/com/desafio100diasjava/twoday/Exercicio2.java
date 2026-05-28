package com.desafio100diasjava.twoday;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        Integer senhaCorreta = 1234;

        System.out.println("Usuário: ");
        String usuario = sc.nextLine();
        System.out.println("Senha: ");
        Integer senha = sc.nextInt();

        if(usuario.equals("admin") && senha.equals(1234)){
            System.out.println("Usuário logado com sucesso!");
        }
        else {
            System.out.println("Login inválido. Tente Novamente!");
        }
        sc.close();
    }
}
