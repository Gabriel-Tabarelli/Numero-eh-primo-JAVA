package org.tabarelli.gabriel;

import java.util.Scanner;

public class Main {

    public static final int VEZES_NUMERO_PRIMO_PODE_SER_DIVIDO = 2;

    public static void main(String[] args) {
        int numero = lerNumeroEntrada();

        if (ehPrimo(numero))
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
    }

    public static int lerNumeroEntrada() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            try {
                int numero = sc.nextInt();
                if (numero > 0)
                    return numero;
            } catch (Exception ignored) {
                sc.next();
            }
        }
    }

    public static boolean ehPrimo(int numero) {
        int vezesDivididas = vezesNumeroEhDividido(numero);
        return vezesDivididas == VEZES_NUMERO_PRIMO_PODE_SER_DIVIDO;
    }

    public static int vezesNumeroEhDividido(int numero) {
        int vezesDivididas = 0;
        for (int i = 1; i <= numero; i++)
            if (numero % i == 0)
                vezesDivididas++;
        return vezesDivididas;
    }

}