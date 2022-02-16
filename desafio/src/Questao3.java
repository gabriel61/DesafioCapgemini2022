// @author Gabriel Sampaio de Oliveira

// =========================================================== //
// =====================    QUESTÃO 03   ===================== //
// =========================================================== //

/*
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra 
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, 
desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Questao3 {
    
    static int anagrama(String palavra) { // Função que verifica o anagrama

        //No HashMap cada elemento de sua lista possui uma chave e valor associado, 
        //assim podemos realizar uma busca rápida pela chave que desejamos, 
        //sem precisar percorrer toda lista ou saber a posição que desejamos consultar.
        Map<String, Integer> hashMap = new HashMap<>();

        for (int i=0; i<palavra.length(); i++) { // Percorre cada caractere da palavra

            for (int j=i; j<palavra.length(); j++) { // Loop inverso

                char[] substrings = palavra.substring(i, j+1).toCharArray(); // Para cada loop há um corte na palavra usando a função substring com o inicio definido pelo i e o fim pelo j mais uma posição.
                Arrays.sort(substrings); // Ordenando em ordem alfabética a substrings
                String nova = new String(substrings);

                // Juntando os elementos do array em uma unica palavra e criando as combinações.
                if (hashMap.containsKey(nova)) {
                    hashMap.put(nova, hashMap.get(nova) + 1);
                }else {
                    hashMap.put(nova, 1);
                }
            }

        }

        // Exibição da quantidade de anagramas encontrados
        int paresAnagrama = 0;

        for (String nova : hashMap.keySet()) {

            int i = hashMap.get(nova);
            paresAnagrama += (i * (i-1)) / 2; // i = i! /(2! *(i -2)!
        }

        return paresAnagrama;
    }

    public static void main(String[] args) {

        System.out.print("Insira uma palavra de no mínimo 3 letras: ");

        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();

        System.out.print(anagrama(palavra));

    }

}
