/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Vetor_Java {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner (System.in);
        int numeros [] = new int [5];
        
        for (int pos=0;pos<numeros.length;pos++){
            System.out.print("Informe um número: ");
            numeros[pos] = leitura.nextInt();
        }
        
        for (int pos =0; pos<numeros.length;pos++){
            System.out.println("Posição " + pos + "°  - " + numeros[pos]);
        }
    }
    
}
