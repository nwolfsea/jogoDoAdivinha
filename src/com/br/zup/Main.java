package com.br.zup;

import java.util.Scanner;

public class Main {

    public static Scanner entrada() { return new Scanner(System.in); }

    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 1;
        int numero3 = 3;
        int numero4 = 0;

        System.out.println("Digite o número:");
        numero1 = entrada().nextInt();

        if (numero1 == 2) {
            System.out.println("Parabéns, você ganhou 10 pontos.");
        } else if (numero1 == numero2) {
            System.out.println("Parabéns, você ganhou 05 pontos.");
        } else if (numero1 == 3) {
            System.out.println("Parabéns, você ganhou 05 pontos.");
        } else if (numero4 == 0) {
            System.out.println("Você perdeu.");
        }

    }
}
