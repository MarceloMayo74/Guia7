package ejercicio03.entidad;

import java.util.Scanner;

public class Operacion {

    private int Numero1;
    private int Numero2;

    public Operacion(int Numero1, int Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return Numero1;
    }

    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }

    public Operacion crearOperacion() {
        Scanner sc = new Scanner(System.in);
        Operacion operacion = new Operacion();
        System.out.println("Ingrese el primer número");
        operacion.setNumero1(sc.nextInt());
        System.out.println("Ingrese el segundo número");
        operacion.setNumero2(sc.nextInt());
        return operacion;
    }

    public void mostrarSuma(Operacion operacion) {
        int Suma = operacion.getNumero1() + operacion.getNumero2();
        System.out.println("La suma de los números es: " + Suma);

    }

    public void mostrarResta(Operacion operacion) {
        int Resta = operacion.getNumero1() - operacion.getNumero2();
        System.out.println("La resta de los números es: " + Resta);
    }

    public void mostrarMultiplicacion(Operacion operacion) {
        int multiplicacion;
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Se multiplicó por 0, por lo que el resultado es " + 0);
        } else {
            multiplicacion = operacion.getNumero1() * operacion.getNumero2();
            System.out.println("La multiplicacion de los números es: " + multiplicacion);
        }
    }

    public void mostrarDivision(Operacion operacion) {
        double division;
        if (operacion.getNumero2() == 0) {
            System.out.println("Se dividió por 0, por lo que el resultado es " + 0 + ". Error en la operación.");
        } else {
            division = operacion.getNumero1() / operacion.getNumero2();
            System.out.println("La division de los números es: " + division);

        }
    }
}
