import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento    
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
        Projeto objProj1 = new Projeto(1010, "ARROZ COM FRANGO");
        
        objProj1.setDtInicio("25/10/2022");
        objProj1.setDtTermino("30/10/2023");
       
      
        
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioHorista com
       //1 objeto da classe Departamento
       funcHor.setDepartamento(objDep1);
       funcHor.setProjeto(objProj1);
 
              
       
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioMensalista com
       //1 objeto da classe Departamento
       funcMen.setDepartamento(objDep1);
       funcMen.setProjeto(objProj1);
       
       
       
      
       //Estabelecendo a associação binária entre 1
       //objeto da classe FuncionarioComissionado com
       //1 objeto da classe Departamento  
       funcCom.setDepartamento(objDep2);
       funcCom.setProjeto(objProj1);
     
       
       
       System.out.println("Funcionario " + funcHor.getNome() + "trabalha no departamento " + funcHor.getDepartamento().getNome());
       System.out.println("Funcionario " + funcMen.getNome() + "trabalha no departamento " + funcMen.getDepartamento().getNome());
       System.out.println("Funcionario " + funcCom.getNome() + "trabalho no departamento " + funcCom.getDepartamento().getNome());
       
       //Estabelecendo a associação binária entre um
       //objeto da classe Departamento com 1 ou mais (1..*)
       //objetos da classe FuncionarioHorista, FuncionarioMensalista
       //e FuncionarioComissionado  
       objDep1.addFuncionario(funcHor);
       objDep1.addFuncionario(funcMen);
       objDep1.addFuncionario(funcCom);
       objDep1.listaFuncionario();
       
       objDep2.addFuncionario(funcCom);
       objDep2.listaFuncionario();
       
  
       objProj1.addFuncionario(funcHor);
       objProj1.addFuncionario(funcMen);
       objProj1.addFuncionario(funcCom);
       objProj1.listarFuncionarios();
     
       
       
       
       
    }    
}
