
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author Nataly
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);     
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                            "Gustavo Rocha",
                                                            "15/07/2002",
                                                            800); 
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030,
                                                            "Matheus Favara",
                                                            "18/02/2000", 0.30
                                                                ); 
        
    
        funcHor.setQtdeHorTrab(90);
        funcMen.setNumSalMin(2);
        funcHor.setCargo("Professor");
        funcMen.setCargo("Atendente");
        funcCom.setSalBase(1200);
        funcCom.addVendas(6000);
        
        
        System.out.println("Nome funcionario horista    => " + funcHor.getNome());
        System.out.println("Numero Registro     => " + funcHor.getRegistro());
        System.out.println("Adimissão   => " + funcHor.getDtAdmisao());
        System.out.println("Cargo   => " + funcHor.getCargo());
        System.out.println("Gratificação    => " +
                           df. format(funcHor.calcGratificacao()));
        System.out.println("Salário Bruto   => " + 
                           df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto        => " +
                           df.format(funcHor.calcDesconto())); 
        System.out.println("Salário Liquido     => " +
                           df. format(funcHor.calcSalLiquido()));
        
        
        System.out.println("\n\nNome funcionario mensalista    => " + funcMen.getNome());
        System.out.println("Numero Registro     => " + funcMen.getRegistro());
        System.out.println("Adimissão   => " + funcMen.getDtAdmisao());
                System.out.println("Cargo   => " + funcMen.getCargo());
        System.out.println("Salário Bruto   => " + 
                           df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto        => " +
                           df.format(funcMen.calcDesconto())); 
        System.out.println("Salário Liquido     => " +
                           df. format(funcMen.calcSalLiquido()));
        
        
        System.out.println("\n\nNome funcionario Comissionado    => " + funcCom.getNome());
        System.out.println("Numero Registro     => " + funcCom.getRegistro());
        System.out.println("Adimissão   => " + funcCom.getDtAdmisao());
        System.out.println("Taxa de comissão     => " + funcCom.getTaxaComissao());
        System.out.println("Gratificação    => " +
                           df. format(funcCom.calcGratificacao()));
        System.out.println("Salário Bruto   => " + 
                           df.format(funcCom.calcSalBruto()));
        System.out.println("Desconto        => " +
                           df.format(funcCom.calcDesconto())); 
        System.out.println("Salário Liquido     => " +
                           df. format(funcCom.calcSalLiquido()));
        
    }
}
