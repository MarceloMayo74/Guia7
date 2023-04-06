package ejercicio02.entidad;

import java.util.Scanner;

public class Circunferencia {

    private double Radio;

    public Circunferencia() {
    }

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public Circunferencia crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingrese el radio del objeto");
        circunferencia.setRadio(sc.nextDouble());
        return circunferencia;
    }

    public void mostrarArea(Circunferencia circunferencia) {
        double area = Math.PI * (Math.pow(circunferencia.getRadio(), 2));
        System.out.println("El área del círculo es: " + area);

    }

    public void mostrarPerimetro(Circunferencia circunferencia) {
        double perimetro = Math.PI * circunferencia.getRadio() * 2;
        System.out.println("El perimetro del círculo es: " + perimetro);
    }
}
