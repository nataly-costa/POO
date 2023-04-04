package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmisao;
    private String Cargo;

    public Funcionario(int registro, String nome, String dtAdmisao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmisao = dtAdmisao;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmisao() {
        return dtAdmisao;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    //Método abstrato
    //Apresenta a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
    
}
