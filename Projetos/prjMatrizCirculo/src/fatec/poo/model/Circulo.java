package fatec.poo.model;

/**
 *
 * @author Nataly
 */
public class Circulo {
        private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcArea(){
        return(3.1416 * Math.pow(raio, 2)); // Daria pra usar Math.PI no lugar do 3.1416
    }
    
    public double calcPerimetro(){
        return(2 * 3.1416 * raio);
    }
    
    public double calcDiametro(){
        return(2 * raio);
    }
}
