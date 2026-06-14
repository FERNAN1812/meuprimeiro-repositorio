/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.meuprimeiroprojeto;

import java.util.Scanner;

public class exercicio1 {

 public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in); 
        
        System.out.println("insira a primeira nota");
       double nota1 = entrada.nextDouble();
       
        System.out.println("insira a segunda nota");
       double nota2 = entrada.nextDouble(); 
       
        System.out.println("insira a terceira nota");
        double nota3 = entrada.nextDouble();  
   
       double media = (nota1 + nota2 + nota3) / 3;
       
        System.out.println("a media dos valores e " + String.valueOf(media));
   
    }
    
}
