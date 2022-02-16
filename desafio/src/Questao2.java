// @author Gabriel Sampaio de Oliveira

// =========================================================== //
// =====================    QUESTÃO 02   ===================== //
// =========================================================== //

/*
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha 
precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
*/


import java.util.Scanner;
import java.util.regex.*;


public class Questao2 {

    
    public static int validarSenha(String senha) {

        int validador = 0; // Contador para verificar se a senha satisfaz todos os requisitos

        if (senha.length() >= 6) { // Verifica se a senha possui + ou mais caracteres
            validador++;
        }else {
            System.out.println("Sua senha deve possuir pelo menos 6 caracteres!");
        }

        Matcher numero = Pattern.compile("[0-9]").matcher(senha); // Verifica se a senha possui ao menos 1 numero
        if (numero.find()) {
            validador++;
        }else {
            System.out.println("Sua senha deve possuir pelo menos 1 número!");
        }
            
        Matcher maiusculo = Pattern.compile("[A-Z]").matcher(senha); // Verifica se a senha possui ao menos 1 letra maiuscula
        if (maiusculo.find()) {
            validador++;
        }else {
            System.out.println("Sua senha deve possuir pelo menos 1 letra maiúscula!");
        }

        Matcher minusculo = Pattern.compile("[a-z]").matcher(senha); // Verifica se a senha possui ao menos 1 letra minuscula
        if (minusculo.find()) {
            validador++;
        }else {
            System.out.println("Sua senha deve possuir pelo menos 1 letra minúscula!");
        }

        Matcher caracteres = Pattern.compile("[!@#%^$&*()\\-+]").matcher(senha); // Verifica se a senha possui ao menos 1 dos caracteres especiais
        if (caracteres.find()) {
            validador++;
        }else {
            System.out.println("Sua senha deve possuir pelo menos 1 dos caracteres especiais: !@#$%^&*()-+");
        }

        return(validador);
    }


    public static void main(String[] args) {

        System.out.print("Insira sua Senha: ");
        Scanner sc = new Scanner(System.in);
        String senha = sc.next();

        // Chamando a função com a senha sugerida pelo usuario como paramentro, 
        // caso a função retorne 5, ou seja, satisfaz todos os requisitos, então printa na tela que a senha foi validada,
        // caso contrario, a propria função irá printar os requisitos faltantes.
        if(validarSenha(senha) == 5){ 
            System.out.print("Senha validada com sucesso!");
        }
        
    }
}
