package boletim;


public class Boletim {
    
    public float nota1,nota2,nota3;
    
    public float CalcularMedia (float n1, float n2, float n3){
        
        return (n1+n2+n3)/3;
    }
    
    public String MostrarSituacao(float m)
    {
        String situ = null;
        
        if(m>=6)
        {
            situ = "Aprovado";
        }
        if(m >= 3 && m <= 6)
        {
            situ = "Exame";
        }
        if(m < 3)
        {
            situ = "Reprovado";
        }
        
        return situ;
    }
 
    public static void main(String[] args) {
        frmBoletim frm1 = new frmBoletim();
        frm1.setVisible(true);
    }
    
}
