package fatec.poo.model;


public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void listarFuncionarios(){
    System.out.print("\nCodigo: " + codigo);
    System.out.print("\nDescrição: " + descricao);
    System.out.print("\n:Data de Inicio: " + dtInicio);
    System.out.print("\n:Data de Termino: " + dtTermino);
    System.out.print("\n Qtde funcionarios:" + numFunc);

    System.out.print("\nRegistro// Nome do funcionario// Cargo// Departamento:");
        for(int i = 0; i < numFunc; i ++)
        {
            System.out.print("\n" +  + "\t\t" + funcionarios[i].getNome() + "\t\t" + funcionarios[i].getCargo() + "\n");
        } 
    }
}
