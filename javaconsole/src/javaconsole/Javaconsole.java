
package javaconsole;

import java.util.Scanner;


public class Javaconsole {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Digite seu nome: ");
       String nome = s.nextLine();
       System.out.print("Digite sua idade: ");
       int idade = s.nextInt();
       System.out.print("Digite o saldo da conta: ");
       float saldo = s.nextFloat();
       System.out.print("Nome: " + nome);
       System.out.print("Idade: " + idade);
       System.out.print("Valor: " + saldo);
    }
    
}
