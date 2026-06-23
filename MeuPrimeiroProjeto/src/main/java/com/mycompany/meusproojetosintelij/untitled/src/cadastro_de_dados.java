import java.util.Scanner;

public class cadastro_de_dados {
    public static void main(String [] agrs){
        //Criteriais de login
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite seu nome");
        String name= entrada.nextLine();


//Codigo sobre o CPF
        System.out.println("Enforme seu cpf");
        String Cpf= "";
        Cpf=entrada.nextLine();
      while (Cpf.length() !=11){

        if (Cpf.length() != 11) {
            System.out.println("cpf nao indenificado");

        }
        System.out.println(" digite o cpf novamente");
          Cpf=entrada.nextLine();
        }

        String Cpfformatado=
                        Cpf.substring(0,3)+"."+
                        Cpf.substring(3,6)+"."+
                        Cpf.substring(6,9)+"-"+
                        Cpf.substring(9,11);
        


//Codigo sobre o telefone
        System.out.println("Enforme seu numero de telefone");
        String namber="";
        namber= entrada.nextLine();
        while (namber.length() !=11){

        if (namber.length() !=11)
            System.out.println("O Numero esta errado Digite o Numero novamente");
            namber= entrada.nextLine();
            }

        String NamberFormat=
                        namber.substring(0,0)+"("+
                        namber.substring(0,2)+")"+
                                namber.substring(2,7)+"-"+
                                namber.substring(7,11);



// Codigo sobre a Data
        System.out.println("Enforme sua data de nacimeto");
        String Data= entrada.nextLine();
      String dataformatada=
                        Data.substring(0,2)+"/"+
                        Data.substring(2,4)+"/"+
                        Data.substring(4,8)+"/";


// Codigo sobre o endereço
        System.out.println("Enforme seu endereço");
        String endereço= entrada.nextLine();


//Oque sera exibido na tela
        System.out.println("Os dados Cadastrados são de " + name);

        System.out.println(name);
        System.out.println(NamberFormat);
        System.out.println(Cpfformatado);
        System.out.println(dataformatada);
        System.out.println(endereço);

    }
}
//Fim do codigo