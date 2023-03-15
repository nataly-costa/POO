package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Retangulo {
    private double altura;
    private double base;
        private String unidadedeMedida;
    
// Definição do método construtor
        
    
    public Retangulo(String uniMed){
        unidadedeMedida = uniMed;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    public void setBase(double b){
        base = b;
    }    
    public double getAltura(){
        return(altura);
    }    
    public double getBase(){
        return(base);        
    }    

    public String getUnidadedeMedida() {
        return unidadedeMedida;
    }
    
    
    
    public double calcArea(){
        return(base * altura);
    }
    public double calcPerimetro(){
        return( 2 * (base + altura));
    }
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(altura,2)+ Math.pow(base,2)));
    }
}
