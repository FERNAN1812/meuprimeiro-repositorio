/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meuprimeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author KIOTACAPK
 */
public class MeuPrimeiroProjeto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        System.out.println("digite o primeiro numero");
       
        int numero1 = entrada.nextInt();
        System.out.println("digite o segundo numero");
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;
    
        System.out.println("a soma dos numeros e");
         System.out.println(soma);    }
}
