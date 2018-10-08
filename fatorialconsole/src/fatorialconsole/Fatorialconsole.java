
package fatorialconsole;

import java.util.Scanner;


public class Fatorialconsole {

    
    public static void main(String[] args) {
        int i,fator;
        long result = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número: ");
        fator = s.nextInt();
        //result = fator;
        for (i = fator; i >= 1; i--){
            result = result * i;
        }
        System.out.print("O Fatorial é: "+result+"\n");
    }
    
}
