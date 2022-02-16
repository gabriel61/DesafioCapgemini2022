// @author Gabriel Sampaio de Oliveira

// =========================================================== //
// =====================    QUESTÃO 01   ===================== //
// =========================================================== //

/*
Escreva um algoritmo que mostre na tela uma escada de tamanho n 
utilizando o caractere * e espaços. A base e altura da escada devem 
ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
*/

import java.util.Scanner;


public class Questao1 {

    public static void escada(int n) {
        
        for (int i=0; i<n; i++) { //For que percorre todas as linhas, ou seja, de 0 a n
            //Para cada linha faça:
            for (int j=i; j<n-1; j++) { //For de i a n-1
                System.out.print(" ");  //Adiciona espaço em branco até n-1
            }
            for (int j=0; j<i+1; j++) { //Percorre de 0 a i+1 
                System.out.print("*"); //Adiciona um *
            }
            System.out.println(); //Quebra de linha
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um tamanho inteiro para sua escada: ");

        escada(sc.nextInt()); //Chama a função criada, utilizando como parametro o número escolhido pelo usuario
    }

}
