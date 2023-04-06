package ejercicio04.entidades;

import java.util.Scanner;

public class Rectangulo {

    private int Base;
    private int Altura;

    public Rectangulo(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public Rectangulo crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la base");
        rectangulo.setBase(sc.nextInt());
        System.out.println("Ingrese la altura");
        rectangulo.setAltura(sc.nextInt());
        return rectangulo;

    }

    public void mostrarRectangulo(Rectangulo rectangulo) {
        int superficie = rectangulo.getBase() * rectangulo.getAltura();
        System.out.println("El area del rectángulo es: " + superficie);
        int perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rectangulo) {
        for (int i = 1; i <= rectangulo.getAltura() ; i++) {
            for (int j = 1; j <= rectangulo.getBase(); j++) {
                if (i == 1 || i == rectangulo.getAltura() || j == 1 || j == rectangulo.getBase()) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
