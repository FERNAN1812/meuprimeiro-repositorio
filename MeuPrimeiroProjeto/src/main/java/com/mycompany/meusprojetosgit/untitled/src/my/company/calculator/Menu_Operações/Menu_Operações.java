package my.company.calculator.Menu_Operações;

import java.util.Scanner;

public class Menu_Operações {

    public static int menuOperações() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Operações === ");
        System.out.println("1 - Adição  ");
        System.out.println("2 - Multiplicação ");
        System.out.println("3 - Subitração ");
        System.out.println("4 - Divisão ");
        System.out.println("Escolha:");

        int escolhamenuOp;
        escolhamenuOp = entrada.nextInt();
        return escolhamenuOp;
    }
}
