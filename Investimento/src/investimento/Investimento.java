
package investimento;


public class Investimento {
    
    float vlrpresent, taxa;
    int prazo;
    
    public float Calcinvest (float vlrpresent, float taxa, int prazo) {
    
        float vlrfuturo;
        float juros;
        
        juros = (float) Math.pow(1 + taxa,prazo);
        
        vlrfuturo = vlrpresent * juros;
        return vlrfuturo;
    }
    
    public String ImprimirTipo (float vlrfuturo, int prazo){
        String tipo = null;
        
        if (prazo >= 24 && vlrfuturo >= 30000){
            tipo = "Poupança";
        }
        else if (prazo >= 12 && vlrfuturo <= 15000){
            tipo = "Renda Fixa(CDB e LC)";
        }
        else if (prazo <= 6 && vlrfuturo <= 10000){
            tipo = "Renda Variável(Fundos e Mercados)";
        } 
        else{
            tipo = "Rever Investimento";
        }
        
        return tipo;
    }

    
    public static void main(String[] args) {
        
        frminvestimento frm_invest = new frminvestimento();
        frm_invest.setVisible(true);
    }
    
}
