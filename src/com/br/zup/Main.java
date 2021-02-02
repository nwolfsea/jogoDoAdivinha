package com.br.zup;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);

        System.out.println("Digite um numero: ");
        int numeroDoUsuario = new Scanner(System.in).nextInt();

        boolean errou = true;
        while (errou) {
            if (numeroAleatorio == numeroDoUsuario) {
                errou = false;
                System.out.println("Você acertou o numero era " + numeroAleatorio+"");
            }
        }
    }
}

