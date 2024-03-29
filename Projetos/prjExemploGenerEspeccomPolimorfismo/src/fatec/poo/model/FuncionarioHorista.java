package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmisao, double valHorTrab) {
        super(registro, nome, dtAdmisao);//chamada do método da superclasse
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    //Aplicando o polimorfismo
    //sobreposição(override) de métodos
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(calcSalBruto() * 0.075);
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
