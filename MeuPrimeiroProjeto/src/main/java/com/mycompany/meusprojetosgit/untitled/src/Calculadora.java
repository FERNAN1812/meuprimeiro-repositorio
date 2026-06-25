import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //calculo inicio Da calculadora

        int escolha2 = 0;
//Bloco que recebe o modo que o usuario ira ultilizar
        //caso o usuario erre e dgite uma letra
        int escolhamenu = 0;
        while (escolhamenu != 1 && escolhamenu != 2) {
            System.out.println("=== Calculadora ===");
            System.out.println("1 - Argumentos");
            System.out.println("2 - Scanner");
            System.out.println("Escolha:");
            try {
                escolhamenu = entrada.nextInt();

            } catch (Exception e) {
                System.out.println("Digite Apenas Numeros validos 1 ou 2! ");
                entrada.nextLine();
            }
//bloco de seleção da operação de e 1 ou 2
        }
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("=== Operação ===");
            System.out.println("1 - Subtrair");
            System.out.println("2 - somar");
            System.out.println("Escolha:");
            try {
                escolha2 = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Digite Apenas Numeros validos 1 ou 2! ");
                entrada.nextLine();
            }
        }
        int x = 0;
        int y = 0;
        // Bloco 01 Recebe os numeros
        if (escolhamenu == 1 && args.length == 2) {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);

        } else {
            System.out.println("Modo argumento Escolhido, mas não foram passados argumentos.");
            System.out.println("Alterando para Scanner...");
            System.out.println("digite um numero");
            x = entrada.nextInt();
            System.out.println("digite um segundo numero");
            y = entrada.nextInt();

        } switch (escolha2) {

            case 1 :
            System.out.println("=== Subitração ===");
            minus(x, y);
            break;

            case 2:
            System.out.println("=== Adição ===");
                sum(x, y);
                break;

        }


        // fim Bloco 01 Recebe os numeros

    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
//fim Bloco 02 Calcula os numeros

    }

}
// Variaveis ja usadas
// int a = entrada.nextInt(); ultilizada para soma de else escolha 2
// int b = entrada.nextInt();

// int x = Integer.parseInt(args[0]);
// int y = Integer.parseInt(args[1]);

// int escolha = entrada.nextInt(); ultilizada para receber numero if
