package my.company.calculator.codigo_main;

import my.company.calculator.Menu_Operações.Menu_Operações;
import my.company.calculator.Menu_Usuarios.Menu_Usuario;
import my.company.calculator.SubProcessos.Adição.Adicao;
import my.company.calculator.SubProcessos.Divizão.Divisao;
import my.company.calculator.SubProcessos.Multiplicação.Multiplicacao;
import my.company.calculator.SubProcessos.Subtração.Subtracao;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Puxando do menu.U menu do usuario seleciona o modo que sera executado

        int escolhaMenu = Menu_Usuario.mostrar_menu();
int a =0;
int b =0;
        if (escolhaMenu == 1) {
            System.out.println("voce escolheu Argumentos");

            if (args.length != 2){
                System.out.println("voce precisa informar dois numeros ");
                return;
            }

             a = Integer.parseInt(args[0]);
             b = Integer.parseInt(args[1]);

        } else if (escolhaMenu == 2) {
            System.out.println("voce escolheu Scanner");
        }
        // Menu Operacoes com a seleçao das operacoes

        int escolhamenuOp = Menu_Operações.menuOperações();


        switch (escolhamenuOp) {
            //Adicao
            case 1:
                System.out.println("Voce escolheu adiçao");
                System.out.println("Digite um numero");
                int Numero1 = entrada.nextInt();
                System.out.println("Digite um segundo numero");
                int Numero2 = entrada.nextInt();
                int resultado = Adicao.somar(Numero1, Numero2);
                System.out.println("Resultado " + resultado);
                break;
            //Multiplicacao
            case 2:
                System.out.println("Voce Escolheu Multiplicaçao");
                System.out.println("Digite um numero");
                int Numero3 = entrada.nextInt();
                System.out.println("Digite um segundo numero");
                int Numero4 = entrada.nextInt();
                int resultadomultiplicacao = Multiplicacao.multiplicar(Numero3, Numero4);
                System.out.println("Resultado " + resultadomultiplicacao);
                break;
            //Subitracao
            case 3:
                System.out.println("Voce escolheu Subitraçao");
                System.out.println("Digite um numero");
                int Numero5 = entrada.nextInt();
                System.out.println("Digite um segundo numero");
                int Numero6 = entrada.nextInt();
                int resultadosubitracao = Subtracao.subitrair(Numero5, Numero6);
                System.out.println("Resultado " + resultadosubitracao);
                break;
            //Divisao
            case 4:
                System.out.println("Voce escolheu divisao");
                System.out.println("Digite um numero");
                int Numero7 = entrada.nextInt();
                System.out.println("Digite um segundo numero");
                int Numero8 = entrada.nextInt();
                double resultadodivisao = Divisao.dividir(Numero7, Numero8);
                System.out.println("Resultado " + resultadodivisao);

                break;


        }


    }
}

