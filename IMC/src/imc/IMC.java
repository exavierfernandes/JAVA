/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;


public class IMC {

    public float peso, altura;
    
    public float CalcularIMC (float p, float al){
        double IMC;
        
        IMC = p / (Math.pow(al, 2));
        
        return (float) IMC;
    }
    
    public String ImprimirClassif (float imc){
        String classif = null;
        
        if(imc <= 18.5){
            classif = "Abaixo";
        }
        if(imc > 18.5 && imc < 25){
            classif = "Ideal";
        }
        if(imc >= 25 && imc < 30){
            classif = "Sobrepeso";
        }
        if(imc >= 30 && imc < 35){
            classif = "Obeso";
        }
        if(imc >= 35 && imc < 40){
            classif = "Obesidade Severa";
        }
        if(imc >= 40){
            classif = "Obesidade Mórbida";
        }
        
        return classif;
    }
    
    
    
    public static void main(String[] args) {
        frmIMC frm1 = new frmIMC();
        frm1.setVisible(true);
    }
    
}
