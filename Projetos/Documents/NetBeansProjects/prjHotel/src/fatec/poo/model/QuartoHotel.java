package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public class QuartoHotel {
    private int numQuarto, numRG;
    private double valorDiario, totalFaturado;
    private boolean situacao;

    public QuartoHotel(int numQuarto, double valorDiario) {
        this.numQuarto = numQuarto;
        this.valorDiario = valorDiario;
    }
   
    public void reservar(int RG){
        situacao = true;
    }
    
    
    public double liberar (int dias){
        situacao = false;
        numRG = 0;
        totalFaturado = totalFaturado + (valorDiario * dias);
        return (valorDiario * dias);
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
    
    
}
