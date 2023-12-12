package Modelos;

public class Quadrado extends Retangulo{


    public Quadrado(String cor, double lado1, double lado2) {
        super(cor, lado1, lado2);
    }

    @Override
    public double area() {
        return this.getLado1() * this.getLado1() ;
    }

    @Override
    public String toString() {
        return "Quadrado = area: "+this.area()+", cor: "+super.getCor()+'}';
    }
}
