package Principal;

import Modelos.Circulo;
import Modelos.Quadrado;
import Modelos.Retangulo;
import Modelos.Triangulo;

public class Main {
    public static void main(String[] args) {
        var quadrado = new Quadrado("Verde", 5.54, 7);
        var triangulo = new Triangulo("Azul", 7, 10);
        var circulo = new Circulo("Amarelo", 8.0);
        var retangulo = new Retangulo("Magenta", 25.6, 12.1);

        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);

    }
}