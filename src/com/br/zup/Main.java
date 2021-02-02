package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner createScanner() {
        return new Scanner(System.in);
    }

    public static Scanner entrada() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        int pontos = 0;
        boolean continuar = true;
        int contador = 0;
        List<Integer> erros = new ArrayList<>();
        List<Integer> acertos = new ArrayList<>();

        while (continuar) {
            Random numeroAleatorio = new Random();
            int numero = numeroAleatorio.nextInt(5);
            System.out.println("Digite um número");
            int resposta = createScanner().nextInt();

            if (resposta == numero) {
                System.out.println("Você acertou! Ganhou10 pontos!");
                acertos.add(numero);
                pontos = pontos + 10;
                System.out.println("Seu total de pontos é: " + pontos);
                contador++;

            } else if (resposta != numero) {
                if (numero - resposta == 1) {
                    System.out.println("O valor digitado é " + resposta + " e o número sorteado é: " + numero
                            + " Você ganhou 5 pontos");
                    pontos = pontos + 5;
                    erros.add(numero);
                } else if (numero - resposta == -1) {
                    System.out.println("Você perdeu o jogo!");

                }
            }
        }
    }
}
