
package somatorio1a10impar;


public class Somatorio1a10impar {

    
    public static void main(String[] args) {
        int i,soma = 0;
        
        for(i = 1; i <= 10; i++){
            if(i % 2 != 0){
                soma = soma + i;
            }
        }
        
        System.out.println("A soma do impares é: "+soma);
    }
    
}
