package fatorialgrafico;

public class Fatorialgrafico {
    
    int fator;
    
    public int CalcFator (int fator){
        int i;
        long result = 1;
        
        //result = fator;
        
        for(i = fator; i >= 1; i--){
            result = result * i;
        }
        
        return (int) result;
    }
    
    public static void main(String[] args) {
        frmfatorial frm1 = new frmfatorial();
        frm1.setVisible(true);
    }
    
}
