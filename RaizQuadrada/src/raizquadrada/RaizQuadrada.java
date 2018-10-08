
package raizquadrada;


public class RaizQuadrada {
    
    int n;
    String raizq;
    
    public String CalcRaiz(){
        
        int cont = 0, i = 1,result = 1;
        
        while(result > 0){
            
            cont = cont + 1;
            result = n - i;
            i = i + 2;
            n = result;
            }
        
        if(result < 0){
            
            raizq = String.format("Entre %d e %d", cont-1,cont);
            
            return raizq;
        }

        raizq = String.valueOf(cont);
        
        
        return raizq;        
    }

    
    public static void main(String[] args) {
        frmRQ frm = new frmRQ();
        frm.setVisible(true);
    }
    
}
