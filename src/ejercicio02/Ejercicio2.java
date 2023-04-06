/*
 * Declarar una clase llamada Circunferencia que tenga como atributo
 * privado el radio de tipo real. A continuación, se deben crear los
 * siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.-/-
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.-/-
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda-/-
 * en el atributo del objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area=〖
 * π*radio〗^2).
 * e) Método perimetro(): para calcular el perímetro
 * (Perimetro=2*π*radio).
 */
package ejercicio02;

import ejercicio02.entidades.Circunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia().crearCircunferencia();
        circunferencia1.mostrarCircunferencia(circunferencia1);
    }
}
