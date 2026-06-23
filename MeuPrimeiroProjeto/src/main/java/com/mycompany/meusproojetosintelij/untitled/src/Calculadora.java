import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //calculo inicio Da calculadora

        System.out.println("=== Calculadora ===");
        System.out.println("1 - Argumentos");
        System.out.println("2 - Scanner");
        System.out.println("Escolha:");
        int escolha = entrada.nextInt();

        if (escolha == 1) {
//calculo para o cmd
            if (args.length == 2) {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);

                sum(x, y);
            }else{
                System.out.println("não contém argumentos");
                System.out.println("digite um numero");
                int a = entrada.nextInt();
                System.out.println("digite um segundo numero");
                int b = entrada.nextInt();
                sum(a, b);
            }
        } else if (escolha == 2) {
            System.out.println("digite um numero");
            int a = entrada.nextInt();
            System.out.println("digite um segundo numero");
            int b = entrada.nextInt();
            sum(a, b);
            //Calculo no teclado dento do inelij

        } else {
            System.out.println("escolha inválida");
        }


    }

    static void sum(int x, int y) {
        System.out.println(x + y);

    }

}
// Variaveis ja usadas
// int a = entrada.nextInt(); ultilizada para soma de else escolha 2
// int b = entrada.nextInt();

// int x = Integer.parseInt(args[0]);
// int y = Integer.parseInt(args[1]);

// int escolha = entrada.nextInt(); ultilizada para receber numero if
