import java.util.Scanner;

public class Variaveis05 {


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //the varieble and sum
int num0 = 10;
int num1 = 2;
int sum = num1 + num0;
 int divid = sum / 2;
        //what will appear on the screen
        System.out.println(divid);

        //the Variable text
        String nome ="Ela ";
        String condição ="E linda";
        System.out.println(nome + condição);

        System.out.println("Digite sua idade ");
//Age Calculator

        int condiçao1 = entrada.nextInt();
      boolean idad= (condiçao1 >= 25);
      if (idad){
        System.out.println(condiçao1 + " não da futuro");

        }else if (condiçao1 <= 15 ) {

        System.out.println(" não da futuro");


      } else {

            System.out.println(" da futuro");




        }
    }
}
