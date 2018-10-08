
package mdc;

public class MDC {
    
    int n1,n2;
    
    public int CalcMDC (){
        int resto;
        
        resto = n1 % n2;
        
        while(resto > 0){
            
            n1 = n2;
            n2 = resto;
            resto = n1 % n2;
        }
        
        return n2;
    }

    public static void main(String[] args) {
        frmMDC frm = new frmMDC();
        frm.setVisible(true);
    }
    
}
