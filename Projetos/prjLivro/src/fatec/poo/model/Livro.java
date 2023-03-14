package fatec.poo.model;
public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;
    private double totalMulta;

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalMulta() {
        return totalMulta;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int a){
        double valMulta;
        situacao = false;
        valMulta = a * valMultaDiaria;
        totalMulta = totalMulta + valMulta;
        return(valMulta);
        
    }
}
